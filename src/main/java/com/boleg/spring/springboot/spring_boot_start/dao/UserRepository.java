package com.boleg.spring.springboot.spring_boot_start.dao;


import com.boleg.spring.springboot.spring_boot_start.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
