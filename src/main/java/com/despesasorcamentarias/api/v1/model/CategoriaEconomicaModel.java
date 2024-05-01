package com.despesasorcamentarias.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoriaEconomicaModel {

	@JsonProperty("categoria_economica_codigo")
	private Long id;
	@JsonProperty("categoria_economica_nome")
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
