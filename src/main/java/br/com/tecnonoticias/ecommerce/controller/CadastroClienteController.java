package br.com.tecnonoticias.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tecnonoticias.ecommerce.model.Cliente;

@Controller
@RequestMapping("/cliente")
public class CadastroClienteController {

	@RequestMapping("/novo")
	public String novo(){
		
		return "CadastroCliente";
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Cliente cliente){
		//TODO: Salvar no banco de dados
		System.out.println(">>> " + cliente.getNome());
		
		return "CadastroCliente";
	}
}
