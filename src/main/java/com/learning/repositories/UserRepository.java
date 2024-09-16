package com.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.course.entities.User;

public interface  UserRepository extends JpaRepository<User, Long>  {
 
}
