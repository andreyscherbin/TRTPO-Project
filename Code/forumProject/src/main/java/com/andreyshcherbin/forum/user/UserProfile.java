
package com.andreyshcherbin.forum.user;

import java.util.Set;

import com.andreyshcherbin.forum.post.Post;
import com.andreyshcherbin.forum.topic.Topic;


public class UserProfile {
    
    private User user;
    
    private Set<Post> posts;
    
    private Set<Topic> topics;
    
    public UserProfile() {}
    
    public UserProfile(User user,
                       Set<Post> posts,
                       Set<Topic> topics) {
        super();
        this.user = user;
        this.posts = posts;
        this.topics = topics;
    }
    
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    public Set<Post> getPosts() {
        return posts;
    }
    
    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
    
    public Set<Topic> getTopics() {
        return topics;
    }
    
    public void setTopics(Set<Topic> topics) {
        this.topics = topics;
    }
    
}
