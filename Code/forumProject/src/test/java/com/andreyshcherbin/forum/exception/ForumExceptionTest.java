package com.andreyshcherbin.forum.exception;

import static org.junit.Assert.assertEquals;

import com.andreyshcherbin.forum.UnitsTestCase;
import com.andreyshcherbin.forum.exception.ForumException;
import com.andreyshcherbin.forum.exception.ForumException.ErrorCode;

import org.junit.Test;

public class ForumExceptionTest extends UnitsTestCase {

    @Test
    public void testShouldGetMessageBasedOnErrorCode() {
        ForumException exception = new ForumException(ErrorCode.INTERNAL_ERROR);
        assertEquals("Internal server error", exception.getMessage());
    }

}
