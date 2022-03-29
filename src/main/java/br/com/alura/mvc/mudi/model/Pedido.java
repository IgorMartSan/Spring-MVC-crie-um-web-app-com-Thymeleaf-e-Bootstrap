package br.com.alura.mvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Pedido {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nomeProduto;
	private BigDecimal Valornegociado;
	private LocalDate dataEntrega;
	private String urlProduto;
	private String urlImag;
	private String descricao;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public BigDecimal getValornegociado() {
		return Valornegociado;
	}

	public void setValornegociado(BigDecimal valornegociado) {
		Valornegociado = valornegociado;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getUrlProduto() {
		return urlProduto;
	}

	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}

	public String getUrlImag() {
		return urlImag;
	}

	public void setUrlImag(String urlImag) {
		this.urlImag = urlImag;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


}
