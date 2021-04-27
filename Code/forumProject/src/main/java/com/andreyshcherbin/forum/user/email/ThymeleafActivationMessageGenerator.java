package com.andreyshcherbin.forum.user.email;

import org.springframework.stereotype.Component;
import org.thymeleaf.context.Context;

import com.andreyshcherbin.forum.user.activation.ActivationCode;

@Component
public class ThymeleafActivationMessageGenerator extends ActivationMessageGenerator {

    private String TEMPLATE = "messages/activation_message";
    private String ACTIVATION_CODE_VARIABLE = "activationCode";

    @Override
    public String createMessageContent(ActivationCode activationCode) {
        Context context = new Context();
        context.setVariable(ACTIVATION_CODE_VARIABLE, activationCode);
        return templateEngine.process(TEMPLATE, context);
    }
}
