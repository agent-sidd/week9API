package com.nagarro.training.library.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.training.library.entities.Books;
import com.nagarro.training.library.repositories.BooksRepository;

@RestController
public class BooksController {

	@Autowired
	BooksRepository booksRepository;

	@PostMapping(path ="/books")
	public Books books(@RequestBody Books books) {
		booksRepository.save(books);
		return books;
	}

	@GetMapping("/books")
	public List<Books> getAllBooks() {
		return booksRepository.findAll();
	}
	
	@GetMapping("/books/{bookId}")
	public Optional<Books> getBook(@PathVariable("bookId") int id ) {
		return booksRepository.findById(id);
	}
	
	@DeleteMapping("/books/{bookId}")
	public String deleteBook(@PathVariable("bookId") int id) {
		Books books= booksRepository.getById(id);
		booksRepository.delete(books);
		return "Deleted";
	}
	
	@PutMapping(path ="/books", consumes = {"application/json"})
	public Books saveorupdate(@RequestBody Books books) {
		booksRepository.save(books);
		return books;
	}
}
