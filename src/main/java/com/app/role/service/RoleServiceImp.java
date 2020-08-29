package com.app.role.service;

import com.app.role.model.Role;
import com.app.role.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImp implements RoleService {

    @Autowired
    private RoleRepository repository;

    @Override
    public List<Role> findAll() { return repository.findAll();}

    @Transactional
    @Override
    public void save(Role _newRole) {
        Optional<Role> r = repository.findRoleByName(_newRole.getRoleName());
        if(!r.isPresent()) {

            repository.save(_newRole);
            return;
        }
        throw new RuntimeException("Role Already Exists");
    }

   @Transactional
    @Override
    public void delete(Role _role) {
        repository.delete(_role);
    }
}
