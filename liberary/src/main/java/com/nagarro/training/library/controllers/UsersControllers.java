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

import com.nagarro.training.library.entities.Users;
import com.nagarro.training.library.repositories.UsersRepository;

@RestController
public class UsersControllers {

	@Autowired
	UsersRepository usersRepository;

	@PostMapping(path = "/users", consumes = { "application/json" })
	public Users users(@RequestBody Users users) {
		usersRepository.save(users);
		return users;
	}

	@GetMapping("/users")
	public List<Users> getAllUsers() {
		return usersRepository.findAll();
	}

	@GetMapping("/users/{Id}")
	public Optional<Users> getUsers(@PathVariable("Id") int id) {
		return usersRepository.findById(id);
	}

	@DeleteMapping("/users/{Id}")
	public String deleteUsers(@PathVariable("Id") int id) {
		Users users = usersRepository.getById(id);
		usersRepository.delete(users);
		return "Deleted";
	}

	@PutMapping(path = "/users", consumes = { "application/json" })
	public Users saveorupdate(@RequestBody Users users) {
		usersRepository.save(users);
		return users;
	}
}
