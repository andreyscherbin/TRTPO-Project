package com.andreyshcherbin.forum.user.activation;

import com.andreyshcherbin.forum.user.User;
import com.andreyshcherbin.forum.user.email.ActivationMessageGenerator;
import com.andreyshcherbin.forum.user.email.EmailMessage;
import com.andreyshcherbin.forum.user.email.SenderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ActivationSenderServiceImpl implements ActivationSenderService {

    @Autowired
    private ActivationCodeRepository repository;

    @Autowired
    private SenderService senderService;

    @Autowired
    private ActivationCodeGenerator activationCodeGenerator;

    @Autowired
    private ActivationMessageGenerator activationMessageGenerator;

    private ActivationCode activationCode;        

    @Override
    public void sendActivationCode(User user) {
        createActivationCode(user);
        saveActivationCode();
        sendMessage();
    }

    private void createActivationCode(User user) {
        String generatedCode = activationCodeGenerator.generate();
        activationCode = new ActivationCode(generatedCode);
        activationCode.setUser(user);
    }

    private void saveActivationCode() {
        activationCode = repository.save(activationCode);
    }

    private void sendMessage() {
        EmailMessage emailMessage = activationMessageGenerator.generate(activationCode);         
        senderService.sendEmail(emailMessage);
    }
}
