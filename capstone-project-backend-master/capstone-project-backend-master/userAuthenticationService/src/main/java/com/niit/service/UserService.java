package com.niit.service;

import com.niit.exception.UserNotFoundException;
import com.niit.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public User saveUser(User user);
    public User findByEmailAndPassword(String email,String password) throws UserNotFoundException;
    public List<User> getAllUsers();
}
