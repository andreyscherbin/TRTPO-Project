package com.andreyshcherbin.forum.user.email;

import com.andreyshcherbin.forum.exception.ForumException;

public interface SenderService {

    void sendEmail(EmailMessage emailMessage) throws ForumException;

}
