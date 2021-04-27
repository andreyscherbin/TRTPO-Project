
package com.andreyshcherbin.forum.post;

import com.andreyshcherbin.forum.post.Post;
import com.andreyshcherbin.forum.topic.Topic;
import com.andreyshcherbin.forum.user.User;

import java.util.List;
import java.util.Set;


public interface PostService {
    
    Post findOne(int id);
    
    List<Post> findAll();
    
    Set<Post> findRecent();
    
    Set<Post> findAllByOrderByCreationDateDesc();
    
    Set<Post> findByUser(User user);
    
    Set<Post> findByTopic(int idTopic);
    
    Set<Post> findByTopic(Topic topic);
    
    void save(Post post);
    
    void delete(int id);
    
    void delete(Post post);
    
    void save(String content,
              String username,
			int idTopic);

}
