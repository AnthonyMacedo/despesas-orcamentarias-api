package com.despesasorcamentarias.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecordModel {

	@JsonProperty("_id")
	private int id;

	@JsonProperty("ano_movimentacao")
	private int anoMovimentacao;

	@JsonProperty("mes_movimentacao")
	private int mesMovimentacao;

	@JsonProperty("orgao_codigo")
	private int orgaoId;

	@JsonProperty("orgao_nome")
	private String orgaoNome;

	@JsonProperty("unidade_codigo")
	private double UnidadeId;

	@JsonProperty("unidade_nome")
	private String UnidadeNome;

	@JsonProperty("categoria_economica_codigo")
	private int categoriaEconomicaId;

	@JsonProperty("categoria_economica_nome")
	private String categoriaEconomicaNome;

	@JsonProperty("grupo_despesa_codigo")
	private int grupoDespesaId;

	@JsonProperty("grupo_despesa_nome")
	private String grupoDespesaNome;

	@JsonProperty("modalidade_aplicacao_codigo")
	private int modalidadeAplicacaoId;

	@JsonProperty("modalidade_aplicacao_nome")
	private String modalidadeAplicacaoNome;

	@JsonProperty("elemento_codigo")
	private int elementoId;

	@JsonProperty("elemento_nome")
	private String elementoNome;

	@JsonProperty("subelemento_codigo")
	private int subelementoId;

	@JsonProperty("subelemento_nome")
	private String subelementoNome;

	@JsonProperty("funcao_codigo")
	private int funcaoId;

	@JsonProperty("funcao_nome")
	private String funcaoNome;

	@JsonProperty("subfuncao_codigo")
	private int subfuncaoId;

	@JsonProperty("subfuncao_nome")
	private String subfuncaoNome;

	@JsonProperty("programa_codigo")
	private int programaId;

	@JsonProperty("programa_nome")
	private String programaNome;

	@JsonProperty("acao_codigo")
	private int acaoId;

	@JsonProperty("acao_nome")
	private String acaoNome;

	@JsonProperty("fonte_recurso_codigo")
	private int fonteRecursoId;

	@JsonProperty("fonte_recurso_nome")
	private String fonteRecursoNome;

	@JsonProperty("empenho_ano")
	private int empenhoAno;

	@JsonProperty("empenho_modalidade_nome")
	private String empenhoModalidade;

	@JsonProperty("empenho_modalidade_codigo")
	private int empenhoModalidadeId;

	@JsonProperty("empenho_numero")
	private int empenhoNumero;

	@JsonProperty("subempenho")
	private int subempenho;

	@JsonProperty("indicador_subempenho")
	private String indicadorSubempenho;

	@JsonProperty("credor_codigo")
	private int credorId;

	@JsonProperty("credor_nome")
	private String credorNome;

	@JsonProperty("modalidade_licitacao_codigo")
	private int modalidadeLicitacaoId;

	@JsonProperty("modalidade_licitacao_nome")
	private String modalidadeLicitacaoNome;

	@JsonProperty("valor_empenhado")
	private String valorEmpenhado;

	@JsonProperty("valor_liquidado")
	private String valorLiquidado;

	@JsonProperty("valor_pago")
	private String valorPago;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnoMovimentacao() {
		return anoMovimentacao;
	}

	public void setAnoMovimentacao(int anoMovimentacao) {
		this.anoMovimentacao = anoMovimentacao;
	}

	public int getMesMovimentacao() {
		return mesMovimentacao;
	}

	public void setMesMovimentacao(int mesMovimentacao) {
		this.mesMovimentacao = mesMovimentacao;
	}

	public int getOrgaoId() {
		return orgaoId;
	}

	public void setOrgaoId(int orgaoId) {
		this.orgaoId = orgaoId;
	}

	public String getOrgaoNome() {
		return orgaoNome;
	}

	public void setOrgaoNome(String orgaoNome) {
		this.orgaoNome = orgaoNome;
	}

	public double getUnidadeId() {
		return UnidadeId;
	}

	public void setUnidadeId(double unidadeId) {
		UnidadeId = unidadeId;
	}

	public String getUnidadeNome() {
		return UnidadeNome;
	}

	public void setUnidadeNome(String unidadeNome) {
		UnidadeNome = unidadeNome;
	}

	public int getCategoriaEconomicaId() {
		return categoriaEconomicaId;
	}

	public void setCategoriaEconomicaId(int categoriaEconomicaId) {
		this.categoriaEconomicaId = categoriaEconomicaId;
	}

	public String getCategoriaEconomicaNome() {
		return categoriaEconomicaNome;
	}

	public void setCategoriaEconomicaNome(String categoriaEconomicaNome) {
		this.categoriaEconomicaNome = categoriaEconomicaNome;
	}

	public int getGrupoDespesaId() {
		return grupoDespesaId;
	}

	public void setGrupoDespesaId(int grupoDespesaId) {
		this.grupoDespesaId = grupoDespesaId;
	}

	public String getGrupoDespesaNome() {
		return grupoDespesaNome;
	}

	public void setGrupoDespesaNome(String grupoDespesaNome) {
		this.grupoDespesaNome = grupoDespesaNome;
	}

	public int getModalidadeAplicacaoId() {
		return modalidadeAplicacaoId;
	}

	public void setModalidadeAplicacaoId(int modalidadeAplicacaoId) {
		this.modalidadeAplicacaoId = modalidadeAplicacaoId;
	}

	public String getModalidadeAplicacaoNome() {
		return modalidadeAplicacaoNome;
	}

	public void setModalidadeAplicacaoNome(String modalidadeAplicacaoNome) {
		this.modalidadeAplicacaoNome = modalidadeAplicacaoNome;
	}

	public int getElementoId() {
		return elementoId;
	}

	public void setElementoId(int elementoId) {
		this.elementoId = elementoId;
	}

	public String getElementoNome() {
		return elementoNome;
	}

	public void setElementoNome(String elementoNome) {
		this.elementoNome = elementoNome;
	}

	public int getSubelementoId() {
		return subelementoId;
	}

	public void setSubelementoId(int subelementoId) {
		this.subelementoId = subelementoId;
	}

	public String getSubelementoNome() {
		return subelementoNome;
	}

	public void setSubelementoNome(String subelementoNome) {
		this.subelementoNome = subelementoNome;
	}

	public int getFuncaoId() {
		return funcaoId;
	}

	public void setFuncaoId(int funcaoId) {
		this.funcaoId = funcaoId;
	}

	public String getFuncaoNome() {
		return funcaoNome;
	}

	public void setFuncaoNome(String funcaoNome) {
		this.funcaoNome = funcaoNome;
	}

	public int getSubfuncaoId() {
		return subfuncaoId;
	}

	public void setSubfuncaoId(int subfuncaoId) {
		this.subfuncaoId = subfuncaoId;
	}

	public String getSubfuncaoNome() {
		return subfuncaoNome;
	}

	public void setSubfuncaoNome(String subfuncaoNome) {
		this.subfuncaoNome = subfuncaoNome;
	}

	public int getProgramaId() {
		return programaId;
	}

	public void setProgramaId(int programaId) {
		this.programaId = programaId;
	}

	public String getProgramaNome() {
		return programaNome;
	}

	public void setProgramaNome(String programaNome) {
		this.programaNome = programaNome;
	}

	public int getAcaoId() {
		return acaoId;
	}

	public void setAcaoId(int acaoId) {
		this.acaoId = acaoId;
	}

	public String getAcaoNome() {
		return acaoNome;
	}

	public void setAcaoNome(String acaoNome) {
		this.acaoNome = acaoNome;
	}

	public int getFonteRecursoId() {
		return fonteRecursoId;
	}

	public void setFonteRecursoId(int fonteRecursoId) {
		this.fonteRecursoId = fonteRecursoId;
	}

	public String getFonteRecursoNome() {
		return fonteRecursoNome;
	}

	public void setFonteRecursoNome(String fonteRecursoNome) {
		this.fonteRecursoNome = fonteRecursoNome;
	}

	public int getEmpenhoAno() {
		return empenhoAno;
	}

	public void setEmpenhoAno(int empenhoAno) {
		this.empenhoAno = empenhoAno;
	}

	public String getEmpenhoModalidade() {
		return empenhoModalidade;
	}

	public void setEmpenhoModalidade(String empenhoModalidade) {
		if (empenhoModalidade != null) {
			this.empenhoModalidade = empenhoModalidade.replace(" ", "_");
		} else {
			this.empenhoModalidade = empenhoModalidade;
		}
	}

	public int getEmpenhoModalidadeId() {
		return empenhoModalidadeId;
	}

	public void setEmpenhoModalidadeId(int empenhoModalidadeId) {
		this.empenhoModalidadeId = empenhoModalidadeId;
	}

	public int getEmpenhoNumero() {
		return empenhoNumero;
	}

	public void setEmpenhoNumero(int empenhoNumero) {
		this.empenhoNumero = empenhoNumero;
	}

	public int getSubempenho() {
		return subempenho;
	}

	public void setSubempenho(int subempenho) {
		this.subempenho = subempenho;
	}

	public String getIndicadorSubempenho() {
		return indicadorSubempenho;
	}

	public void setIndicadorSubempenho(String indicadorSubempenho) {
		this.indicadorSubempenho = indicadorSubempenho;
	}

	public int getCredorId() {
		return credorId;
	}

	public void setCredorId(int credorId) {
		this.credorId = credorId;
	}

	public String getCredorNome() {
		return credorNome;
	}

	public void setCredorNome(String credorNome) {
		this.credorNome = credorNome;
	}

	public int getModalidadeLicitacaoId() {
		return modalidadeLicitacaoId;
	}

	public void setModalidadeLicitacaoId(int modalidadeLicitacaoId) {
		this.modalidadeLicitacaoId = modalidadeLicitacaoId;
	}

	public String getModalidadeLicitacaoNome() {
		return modalidadeLicitacaoNome;
	}

	public void setModalidadeLicitacaoNome(String modalidadeLicitacaoNome) {
		this.modalidadeLicitacaoNome = modalidadeLicitacaoNome;
	}

	public String getValorEmpenhado() {
		return valorEmpenhado;
	}

	public void setValorEmpenhado(String valorEmpenhado) {
		if (valorEmpenhado != null) {
			this.valorEmpenhado = valorEmpenhado.replace(",", ".");
		} else {
			this.valorEmpenhado = valorEmpenhado;
		}
	}

	public String getValorLiquidado() {
		return valorLiquidado;
	}

	public void setValorLiquidado(String valorLiquidado) {
		if (valorLiquidado != null) {
			this.valorLiquidado = valorLiquidado.replace(",", ".");
		} else {
			this.valorLiquidado = valorLiquidado;
		}
	}

	public String getValorPago() {
		return valorPago;
	}

	public void setValorPago(String valorPago) {
		if (valorPago != null) {
			this.valorPago = valorPago.replace(",", ".");
		} else {
			this.valorPago = valorPago;
		}
	}

}
