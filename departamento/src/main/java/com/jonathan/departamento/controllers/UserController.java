package com.jonathan.departamento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonathan.departamento.entities.User;
import com.jonathan.departamento.repositories.UseRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UseRepository repository;
	
	//endpoits
	@GetMapping
	public List<User> findAll(){//findAll é um método que serve para buscar todos os user do banco
		
		List<User> result = repository.findAll();
		return result;
	}
	
	
	@GetMapping(value = "/{Id}")//busca por ID
	public User findById(@PathVariable Long Id){
		
		User result = repository.findById(Id).get();
		return result;
	}
	
	@PostMapping//Cria um novo user
	public User Insert(@RequestBody User user){
		
		User result = repository.save(user);
		return result;
	}
}


