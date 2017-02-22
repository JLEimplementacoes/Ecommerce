package br.com.tecnonoticias.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produto")
public class ProdutoCategoriaController {
	@RequestMapping("/categoria")
	public String novo() {

		return "produto_categoria";

	}
}
