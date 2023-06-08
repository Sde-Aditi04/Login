package com.shield.login.service;


import com.shield.login.dto.UserDTO;
import com.shield.login.model.User;

public interface UserService {
    User createUser(UserDTO userDTO);
    User getUserById(Long id);
    User updateUser(Long id, UserDTO userDTO);
    void deleteUser(Long id);
}

