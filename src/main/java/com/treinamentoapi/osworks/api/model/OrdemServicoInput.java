package com.treinamentoapi.osworks.api.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class OrdemServicoInput {
	
	@NotBlank
	private String descricao;
	
	@NotNull
	private BigDecimal preco;
	
	@NotNull
	@Valid
	private ClienteIdInput cliente;
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public ClienteIdInput getCliente() {
		return cliente;
	}
	public void setClinteId(ClienteIdInput cliente) {
		this.cliente = cliente;
	}
	
	

}
