package br.com.tecnonoticias.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Duvidas_sugestoesController {

	@RequestMapping("/duvidas_sugestoes")
	public String duvidas_Sugestoes(){
		return "duvidas_sugestoes";
	}
	
}
