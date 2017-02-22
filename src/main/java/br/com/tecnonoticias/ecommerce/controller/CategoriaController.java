package br.com.tecnonoticias.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.tecnonoticias.ecommerce.model.Categoria;
import br.com.tecnonoticias.ecommerce.repository.Categorias;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private Categorias categorias;

	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("categoria");
		return mv;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Categoria categoria) {
		categorias.save(categoria);
		ModelAndView mv = new ModelAndView("categoria");
		return mv;
	}
	
	@RequestMapping
	public ModelAndView pesquisa() {
		List<Categoria> todasCategorias = categorias.findAll();
		ModelAndView mv = new ModelAndView("categoria");
		mv.addObject("categorias", todasCategorias);
		return mv;
	}

}
