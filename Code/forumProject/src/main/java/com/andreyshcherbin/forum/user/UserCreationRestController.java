package com.andreyshcherbin.forum.user;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andreyshcherbin.forum.exception.ForumApiException;
import com.andreyshcherbin.forum.exception.ForumException.ErrorCode;

@RestController
@RequestMapping(value = "/api")
public class UserCreationRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserCreationRestController.class);

    @Autowired
    private UserCreationService userCreationService;

    @PostMapping("/users")
    public ResponseEntity create(@Valid @RequestBody UserCreationForm userCreationForm,
        BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            LOGGER.error("Create binding error");
            throw new ForumApiException(ErrorCode.INVALID_USER_FORM, HttpStatus.BAD_REQUEST,
                "/api/users");
        }
        LOGGER.info("CREATE NEW USER: {}", userCreationForm.getUsername());
        userCreationService.create(userCreationForm.getNewUserEntity());
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
