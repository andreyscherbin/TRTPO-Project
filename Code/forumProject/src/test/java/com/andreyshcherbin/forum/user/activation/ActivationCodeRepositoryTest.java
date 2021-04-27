package com.andreyshcherbin.forum.user.activation;

import static org.junit.Assert.assertNotNull;

import com.andreyshcherbin.forum.IntegrationTestCase;
import com.andreyshcherbin.forum.user.activation.ActivationCode;
import com.andreyshcherbin.forum.user.activation.ActivationCodeRepository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ActivationCodeRepositoryTest extends IntegrationTestCase {

    @Autowired
    private ActivationCodeRepository repository;


    @Test
    public void testSaveShouldReturnEntity() {
        ActivationCode activationCode = new ActivationCode("XXX");
        activationCode = repository.save(activationCode);

        assertNotNull(activationCode);
    }
}
