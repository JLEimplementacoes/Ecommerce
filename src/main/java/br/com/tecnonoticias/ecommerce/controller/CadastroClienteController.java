package br.com.tecnonoticias.ecommerce.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.tecnonoticias.ecommerce.model.Cliente;
import br.com.tecnonoticias.ecommerce.model.StatusCliente;
import br.com.tecnonoticias.ecommerce.repository.Clientes;

@Controller
@RequestMapping("/cliente")
public class CadastroClienteController {

	@Autowired
	private Clientes clientes;
	
	@RequestMapping("/novo")
	public ModelAndView novo(){
		ModelAndView mv = new ModelAndView("CadastroCliente");
		mv.addObject("todosStatus", StatusCliente.values());
		return mv;
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Cliente cliente){
		//TODO: Salvar no banco de dados
		clientes.save(cliente);
		
		ModelAndView mv = new ModelAndView("CadastroCliente");
		mv.addObject("mensagen", "Cliente cadastrado com sucesso!");
		return mv;
	}
	
	@ModelAttribute("statusTitulo")
	public List<StatusCliente> todosStatusCliente(){
		return Arrays.asList(StatusCliente.values());
	}
	
	@RequestMapping
	public String pesquisa(){
		return "PesquisaCliente";
	}
}
