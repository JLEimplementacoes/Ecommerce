package br.com.tecnonoticias.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tecnonoticias.ecommerce.model.Cliente;
import br.com.tecnonoticias.ecommerce.repository.Clientes;

@Controller
@RequestMapping("/cliente")
public class CadastroClienteController {

	@Autowired
	private Clientes clientes;
	
	@RequestMapping("/novo")
	public String novo(){
		
		return "CadastroCliente";
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Cliente cliente){
		//TODO: Salvar no banco de dados
		clientes.save(cliente);
		return "CadastroCliente";
	}
}
