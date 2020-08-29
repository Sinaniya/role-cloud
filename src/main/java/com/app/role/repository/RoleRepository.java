package com.app.role.repository;

import com.app.role.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
Optional<Role> findRoleByName(String name);


@Query("select r from Role r where r.roleName like :name%")
List<Role> findRolesByName(@Param("name") String name);


}
