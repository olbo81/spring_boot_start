package com.boleg.spring.springboot.spring_boot_start.dao;

import com.boleg.spring.springboot.spring_boot_start.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRole(String roleName);

}
