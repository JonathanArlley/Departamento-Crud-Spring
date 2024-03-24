package com.jonathan.departamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathan.departamento.entities.User;

public interface UseRepository extends JpaRepository<User, Long> {
//vai servir para acessar os dados dos users/ serve para implementar dados a uma entidade de seu dominio
	
	
	
}
