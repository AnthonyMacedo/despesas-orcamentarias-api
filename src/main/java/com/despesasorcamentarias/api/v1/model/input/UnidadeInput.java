package com.despesasorcamentarias.api.v1.model.input;

public class UnidadeInput {

	private Long id;
	private String nome;
	private OrgaoIdInput orgao; 

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

	public OrgaoIdInput getOrgao() {
		return orgao;
	}

	public void setOrgao(OrgaoIdInput orgao) {
		this.orgao = orgao;
	}

}
