package com.nagarro.training.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.training.library.entities.Authors;

public interface AuthorsRepository extends JpaRepository<Authors, Integer> {

}
