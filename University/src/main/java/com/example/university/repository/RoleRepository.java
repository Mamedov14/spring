package com.example.university.repository;

import com.example.university.entity.Role;
import com.example.university.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String roleName);
}
