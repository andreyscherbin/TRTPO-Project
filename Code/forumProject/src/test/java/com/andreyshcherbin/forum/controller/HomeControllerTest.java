
package com.andreyshcherbin.forum.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;

import com.andreyshcherbin.forum.IntegrationTestCase;


public class HomeControllerTest extends IntegrationTestCase {


    @Test
    public void testHomePageView() throws Exception {
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }

}
