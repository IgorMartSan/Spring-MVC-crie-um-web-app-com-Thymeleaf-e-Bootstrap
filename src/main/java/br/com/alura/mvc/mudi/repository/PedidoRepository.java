package br.com.alura.mvc.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;

@Repository // essa classe deve ter a lógica que acessa o repositório (banco de dados)
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	public List<Pedido> findAll();

}
