
package com.andreyshcherbin.forum.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreyshcherbin.forum.user.User;


public interface UserRepository extends JpaRepository<User, Integer> {
    
    User findByUsername(String username);
    
    User findByEmail(String email);
    
}
