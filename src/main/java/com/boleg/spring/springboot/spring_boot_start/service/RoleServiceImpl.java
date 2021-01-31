package com.boleg.spring.springboot.spring_boot_start.service;

import com.boleg.spring.springboot.spring_boot_start.dao.RoleRepository;
import com.boleg.spring.springboot.spring_boot_start.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getAllRoles() { return roleRepository.findAll(); }

    @Override
    public void saveRole(Role role) { roleRepository.save(role); }

    @Override
    public void deleteRoleById(Long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public Role getRoleById(Long id) {
        Role role = null;
        Optional<Role> optional = roleRepository.findById(id);
        if(optional.isPresent()) {
            role = optional.get();
        }
        return role;
    }

    @Override
    public Role getByRoleName(String roleName) {
        return roleRepository.findByRole(roleName);
    }
}