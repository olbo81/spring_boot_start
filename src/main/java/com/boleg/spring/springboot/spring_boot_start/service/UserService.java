package com.boleg.spring.springboot.spring_boot_start.service;

import com.boleg.spring.springboot.spring_boot_start.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User saveUser(User user, String[] roles);

    User getUserById(Long id);

    void deleteUserById(Long id);

    User findByEmail(String email);

}
