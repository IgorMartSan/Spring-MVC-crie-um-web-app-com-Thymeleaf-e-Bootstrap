package br.com.alura.mvc.mudi.controller;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PerdidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;

	@GetMapping("formulario")
	public String formulario() {

		return "pedido/formulario";
	}

	@PostMapping("novo")
	public String novo(String nomeProduto, String urlProduto, String imgProduto, String descProduto) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeProduto);
		pedido.setDescricao(descProduto);
		pedido.setUrlImag(imgProduto);
		pedido.setUrlProduto(urlProduto);
		
		pedidoRepository.save(pedido);

		return "pedido/formulario";
	}

}
