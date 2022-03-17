package com.nagarro.training.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.training.library.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
