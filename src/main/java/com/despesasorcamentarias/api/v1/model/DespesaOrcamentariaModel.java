package com.despesasorcamentarias.api.v1.model;

import java.math.BigDecimal;

public class DespesaOrcamentariaModel {

	private Long id;
	private Integer anoMovimentacao;
	private Integer mesMovimentacao;
	private OrgaoModel orgao;
	private UnidadeModel unidade;
	private CategoriaEconomicaModel categoriaEconomica;
	private GrupoDespesaModel grupoDespesa;
	private ModalidadeAplicacaoModel modalidadeAplicacao;
	private ElementoModel elemento;
	private SubelementoModel subelemento;
	private FuncaoModel funcao;
	private SubfuncaoModel subfuncao;
	private ProgramaModel programa;
	private AcaoModel acao;
	private FonteRecursoModel fonteRecurso;
	private Integer empenhoAno;
	private String empenhoModalidade;
	private Integer empenhoNumero;
	private Integer subempenho;
	private String indicadorSubempenho;
	private CredorModel credor;
	private ModalidadeLicitacaoModel modalidadeLicitacao;
	private BigDecimal valorEmpenhado;
	private BigDecimal valorLiquidado;
	private BigDecimal valorPago;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public OrgaoModel getOrgao() {
		return orgao;
	}

	public void setOrgao(OrgaoModel orgao) {
		this.orgao = orgao;
	}

	public CategoriaEconomicaModel getCategoriaEconomica() {
		return categoriaEconomica;
	}

	public void setCategoriaEconomica(CategoriaEconomicaModel categoriaEconomica) {
		this.categoriaEconomica = categoriaEconomica;
	}

	public GrupoDespesaModel getGrupoDespesa() {
		return grupoDespesa;
	}

	public void setGrupoDespesa(GrupoDespesaModel grupoDespesa) {
		this.grupoDespesa = grupoDespesa;
	}

	public ModalidadeAplicacaoModel getModalidadeAplicacao() {
		return modalidadeAplicacao;
	}

	public void setModalidadeAplicacao(ModalidadeAplicacaoModel modalidadeAplicacao) {
		this.modalidadeAplicacao = modalidadeAplicacao;
	}

	public ElementoModel getElemento() {
		return elemento;
	}

	public void setElemento(ElementoModel elemento) {
		this.elemento = elemento;
	}

	public SubelementoModel getSubelemento() {
		return subelemento;
	}

	public void setSubelemento(SubelementoModel subelemento) {
		this.subelemento = subelemento;
	}

	public FuncaoModel getFuncao() {
		return funcao;
	}

	public void setFuncao(FuncaoModel funcao) {
		this.funcao = funcao;
	}

	public SubfuncaoModel getSubfuncao() {
		return subfuncao;
	}

	public void setSubfuncao(SubfuncaoModel subfuncao) {
		this.subfuncao = subfuncao;
	}

	public ProgramaModel getPrograma() {
		return programa;
	}

	public void setPrograma(ProgramaModel programa) {
		this.programa = programa;
	}

	public AcaoModel getAcao() {
		return acao;
	}

	public void setAcao(AcaoModel acao) {
		this.acao = acao;
	}

	public FonteRecursoModel getFonteRecurso() {
		return fonteRecurso;
	}

	public void setFonteRecurso(FonteRecursoModel fonteRecurso) {
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
		this.empenhoModalidade = empenhoModalidade;
	}

	public Integer getEmpenhoNumero() {
		return empenhoNumero;
	}

	public void setEmpenhoNumero(Integer empenhoNumero) {
		this.empenhoNumero = empenhoNumero;
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

	public CredorModel getCredor() {
		return credor;
	}

	public void setCredor(CredorModel credor) {
		this.credor = credor;
	}

	public ModalidadeLicitacaoModel getModalidadeLicitacao() {
		return modalidadeLicitacao;
	}

	public void setModalidadeLicitacao(ModalidadeLicitacaoModel modalidadeLicitacao) {
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

	public UnidadeModel getUnidade() {
		return unidade;
	}

	public void setUnidade(UnidadeModel unidade) {
		this.unidade = unidade;
	}

}
