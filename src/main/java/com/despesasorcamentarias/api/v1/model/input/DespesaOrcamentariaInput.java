package com.despesasorcamentarias.api.v1.model.input;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;

public class DespesaOrcamentariaInput {

	@NotNull
	private Integer anoMovimentacao;
	@NotNull
	private Integer mesMovimentacao;

	@NotNull
	private OrgaoInput orgao;

	@NotNull
	private UnidadeInput unidade;

	@NotNull
	private CategoriaEconomicaInput categoriaEconomica;
	
	@NotNull
	private GrupoDespesaInput grupoDespesa;
	
	@NotNull
	private ModalidadeAplicacaoInput modalidadeAplicacao;
	
	@NotNull
	private ElementoInput elemento;
	
	@NotNull
	private SubelementoInput subelemento;
	
	@NotNull
	private FuncaoInput funcao;
	
	@NotNull
	private SubfuncaoInput subfuncao;
	
	@NotNull
	private ProgramaInput programa;
	
	@NotNull
	private AcaoInput acao;
	
	@NotNull
	private FonteRecursoInput fonteRecurso;
	
	private Integer empenhoAno;
	private String empenhoModalidade;
	private Integer subempenho;
	private String indicadorSubempenho;
	@NotNull
	private CredorInput credor;
	@NotNull
	private ModalidadeLicitacaoInput modalidadeLicitacao;
	private BigDecimal valorEmpenhado;
	private BigDecimal valorLiquidado;
	private BigDecimal valorPago;

	public Integer getAnoMovimentacao() {
		return anoMovimentacao;
	}

	public void setAnoMovimentacao(Integer anoMovimentacao) {
		this.anoMovimentacao = anoMovimentacao;
	}

	public Integer getMesMovimentacao() {
		return mesMovimentacao;
	}

	public void setMesMovimentacao(Integer mesMovimentacao) {
		this.mesMovimentacao = mesMovimentacao;
	}

	public OrgaoInput getOrgao() {
		return orgao;
	}

	public void setOrgao(OrgaoInput orgao) {
		this.orgao = orgao;
	}

	public UnidadeInput getUnidade() {
		return unidade;
	}

	public void setUnidade(UnidadeInput unidade) {
		this.unidade = unidade;
	}

	public CategoriaEconomicaInput getCategoriaEconomica() {
		return categoriaEconomica;
	}

	public void setCategoriaEconomica(CategoriaEconomicaInput categoriaEconomica) {
		this.categoriaEconomica = categoriaEconomica;
	}

	public GrupoDespesaInput getGrupoDespesa() {
		return grupoDespesa;
	}

	public void setGrupoDespesa(GrupoDespesaInput grupoDespesa) {
		this.grupoDespesa = grupoDespesa;
	}

	public ModalidadeAplicacaoInput getModalidadeAplicacao() {
		return modalidadeAplicacao;
	}

	public void setModalidadeAplicacao(ModalidadeAplicacaoInput modalidadeAplicacao) {
		this.modalidadeAplicacao = modalidadeAplicacao;
	}

	public ElementoInput getElemento() {
		return elemento;
	}

	public void setElemento(ElementoInput elemento) {
		this.elemento = elemento;
	}

	public SubelementoInput getSubelemento() {
		return subelemento;
	}

	public void setSubelemento(SubelementoInput subelemento) {
		this.subelemento = subelemento;
	}

	public FuncaoInput getFuncao() {
		return funcao;
	}

	public void setFuncao(FuncaoInput funcao) {
		this.funcao = funcao;
	}

	public SubfuncaoInput getSubfuncao() {
		return subfuncao;
	}

	public void setSubfuncao(SubfuncaoInput subfuncao) {
		this.subfuncao = subfuncao;
	}

	public ProgramaInput getPrograma() {
		return programa;
	}

	public void setPrograma(ProgramaInput programa) {
		this.programa = programa;
	}

	public AcaoInput getAcao() {
		return acao;
	}

	public void setAcao(AcaoInput acao) {
		this.acao = acao;
	}

	public FonteRecursoInput getFonteRecurso() {
		return fonteRecurso;
	}

	public void setFonteRecurso(FonteRecursoInput fonteRecurso) {
		this.fonteRecurso = fonteRecurso;
	}

	public Integer getEmpenhoAno() {
		return empenhoAno;
	}

	public void setEmpenhoAno(Integer empenhoAno) {
		this.empenhoAno = empenhoAno;
	}

	public String getEmpenhoModalidade() {
		return empenhoModalidade;
	}

	public void setEmpenhoModalidade(String empenhoModalidade) {
		if (empenhoModalidade != null) {
			this.empenhoModalidade = empenhoModalidade.toUpperCase();
		} else {
			this.empenhoModalidade = empenhoModalidade;
		}
	}

	public Integer getSubempenho() {
		return subempenho;
	}

	public void setSubempenho(Integer subempenho) {
		this.subempenho = subempenho;
	}

	public String getIndicadorSubempenho() {
		return indicadorSubempenho;
	}

	public void setIndicadorSubempenho(String indicadorSubempenho) {
		this.indicadorSubempenho = indicadorSubempenho;
	}

	public CredorInput getCredor() {
		return credor;
	}

	public void setCredor(CredorInput credor) {
		this.credor = credor;
	}

	public ModalidadeLicitacaoInput getModalidadeLicitacao() {
		return modalidadeLicitacao;
	}

	public void setModalidadeLicitacao(ModalidadeLicitacaoInput modalidadeLicitacao) {
		this.modalidadeLicitacao = modalidadeLicitacao;
	}

	public BigDecimal getValorEmpenhado() {
		return valorEmpenhado;
	}

	public void setValorEmpenhado(BigDecimal valorEmpenhado) {
		this.valorEmpenhado = valorEmpenhado;
	}

	public BigDecimal getValorLiquidado() {
		return valorLiquidado;
	}

	public void setValorLiquidado(BigDecimal valorLiquidado) {
		this.valorLiquidado = valorLiquidado;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

}
