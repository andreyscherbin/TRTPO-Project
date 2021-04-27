
package com.andreyshcherbin.forum.post;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreyshcherbin.forum.topic.Topic;
import com.andreyshcherbin.forum.user.User;


public interface PostRepository extends JpaRepository<Post, Integer> {
    
    Set<Post> findByUser(User user);
    
    Set<Post> findByTopic(Topic topic);
    
    Set<Post> findAllByOrderByCreationDateDesc();
    
    Set<Post> findTop5ByOrderByCreationDateDesc();
}
