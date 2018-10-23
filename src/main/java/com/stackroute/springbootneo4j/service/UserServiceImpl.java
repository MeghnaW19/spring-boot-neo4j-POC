package com.stackroute.springbootneo4j.service;

import com.stackroute.springbootneo4j.domain.User;
import com.stackroute.springbootneo4j.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl  implements UserService {

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Collection<User> getAll() {
        return userRepository.getAllUsers();
    }
}
