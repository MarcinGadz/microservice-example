package com.mg.userservice.dao;

import com.mg.userservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends MongoRepository<User, Long> {
    User findByUsername(String username);
}
