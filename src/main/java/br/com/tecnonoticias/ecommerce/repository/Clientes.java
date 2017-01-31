package br.com.tecnonoticias.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tecnonoticias.ecommerce.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{
	
	

}
