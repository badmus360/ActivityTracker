package com.example.demo.repository;

import com.example.demo.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    UserEntity findUserByPhoneNo(String phoneNo);

    UserEntity findUserByEmail(String email);
}
