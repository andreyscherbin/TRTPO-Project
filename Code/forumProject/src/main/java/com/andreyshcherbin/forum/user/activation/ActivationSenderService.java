package com.andreyshcherbin.forum.user.activation;

import com.andreyshcherbin.forum.user.User;

public interface ActivationSenderService {

    void sendActivationCode(User user);

}
