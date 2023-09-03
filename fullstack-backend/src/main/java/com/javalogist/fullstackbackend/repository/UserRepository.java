package com.javalogist.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalogist.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
