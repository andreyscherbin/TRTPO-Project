
package com.andreyshcherbin.forum.section;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreyshcherbin.forum.section.Section;


public interface SectionRepository extends JpaRepository<Section, Integer> {
    
    Section findByName(String name);
    
}
