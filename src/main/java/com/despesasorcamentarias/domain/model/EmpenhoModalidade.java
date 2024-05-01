package com.despesasorcamentarias.domain.model;

public enum EmpenhoModalidade {

	SEM_TIPO_INFORMADO(0),
	GLOBAL(1),
	ORDINARIO(2),
	ESTIMATIVO(3);

	private Integer codigo;

	EmpenhoModalidade(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

}
