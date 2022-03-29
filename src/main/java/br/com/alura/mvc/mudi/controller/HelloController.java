package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")// 1) Isso indica que quando eu receber um metodo post com o dado hello ele vir para esse metodo (www.localhos:8080/hello)
	public String hello(Model model) {
		
		model.addAttribute("nome", "Mundo");//O objeto model é classe que será possível acessar na view,  
		
		return "hello"; // 2) Os metodos da classe controller servem para envia dados para as views. 
		// 2.1)O return da função indica para qual view ele deve enviar os dados. As view são as paginas web que ficam dentro de src/main/resources/template/hello.html

	}

}
