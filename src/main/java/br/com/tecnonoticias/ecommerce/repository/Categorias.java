package br.com.tecnonoticias.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tecnonoticias.ecommerce.model.Categoria;

public interface Categorias extends JpaRepository<Categoria, Long>{

}
