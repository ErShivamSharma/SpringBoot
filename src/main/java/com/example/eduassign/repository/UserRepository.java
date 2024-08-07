package com.example.eduassign.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eduassign.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
 User findByUsername(String username);
 
 
}
