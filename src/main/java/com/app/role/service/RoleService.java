package com.app.role.service;

import com.app.role.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();
    void save (Role _newRole);
    void delete(Role _role);

}
