package br.com.tecnonoticias.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutoDetalheController {
	
	@RequestMapping("/produto/produto_detalhe")
	public String novo(){
		
		return "produto_detalhe";
		
	}

}
