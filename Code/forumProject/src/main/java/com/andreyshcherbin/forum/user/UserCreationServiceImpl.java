package com.andreyshcherbin.forum.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.andreyshcherbin.forum.user.activation.ActivationSenderService;

@Service
public class UserCreationServiceImpl implements UserCreationService {

	@Autowired
	private UserService userService;

	@Autowired
	private ActivationSenderService activationSenderService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public void create(User user) {
		userService.save(prepareUser(user));
		activationSenderService.sendActivationCode(user);
	}

	private User prepareUser(User user) {
		user.setPassword(getEncodedPassword(user.getPassword()));
		user.setActive(false);
		return user;
	}

	private String getEncodedPassword(String password) {
		return passwordEncoder.encode(password);
	}
}
