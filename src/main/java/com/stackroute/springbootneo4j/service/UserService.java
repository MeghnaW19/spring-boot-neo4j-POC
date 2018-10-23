package com.stackroute.springbootneo4j.service;

import com.stackroute.springbootneo4j.domain.User;
import org.springframework.stereotype.Service;

import java.util.Collection;

public interface UserService {
    public Collection<User> getAll();


}
