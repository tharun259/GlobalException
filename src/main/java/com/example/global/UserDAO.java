package com.example.global;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.global.entity.UserEntity;

@Repository
public interface UserDAO extends JpaRepository<UserEntity, String> {
	
}
