package com.nagarro.training.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.training.library.entities.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

}
