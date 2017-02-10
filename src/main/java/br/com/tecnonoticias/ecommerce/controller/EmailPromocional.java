package br.com.tecnonoticias.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailPromocional {

	@RequestMapping("/emailPromocional")
	public String emailPromocional(){
		return "emailPromocional";
	}
}
