package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,String>{

}
