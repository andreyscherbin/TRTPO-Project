
package com.andreyshcherbin.forum.section;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.andreyshcherbin.forum.IntegrationTestCase;
import com.andreyshcherbin.forum.section.NewSectionForm;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;


public class SectonControllerTest extends IntegrationTestCase {

    @Test
    @Transactional
    @Rollback
    public void testNewSectionFunction() throws Exception {
        NewSectionForm newSection = new NewSectionForm();
        newSection.setName("abc123abc");
        mockMvc.perform(post("/section/new").flashAttr("newSection", newSection)).andExpect(status()
            .is3xxRedirection());
    }
}
