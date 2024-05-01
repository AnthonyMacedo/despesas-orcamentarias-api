package com.despesasorcamentarias.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(schema = "api")
public class DespesaOrcamentaria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer anoMovimentacao;
	private Integer mesMovimentacao;

	@ManyToOne
	@JoinColumn(name = "orgao_id")
	private Orgao orgao;

	@ManyToOne
	@JoinColumn(name = "unidade_id")
	private Unidade unidade;

	@ManyToOne
	@JoinColumn(name = "categoria_economica_id")
	private CategoriaEconomica categoriaEconomica;

	@ManyToOne
	@JoinColumn(name = "grupo_despesa_id")
	private GrupoDespesa grupoDespesa;

	@ManyToOne
	@JoinColumn(name = "modalidade_aplicacao_id")
	private ModalidadeAplicacao modalidadeAplicacao;

	@ManyToOne
	@JoinColumn(name = "elemento_id")
	private Elemento elemento;

	@ManyToOne
	@JoinColumn(name = "subelemento_id")
	private Subelemento subelemento;

	@ManyToOne
	@JoinColumn(name = "funcao_id")
	private Funcao funcao;

	@ManyToOne
	@JoinColumn(name = "subfuncao_id")
	private Subfuncao subfuncao;

	@ManyToOne
	@JoinColumn(name = "programa_id")
	private Programa programa;

	@ManyToOne
	@JoinColumn(name = "acao_id")
	private Acao acao;

	@ManyToOne
	@JoinColumn(name = "fonte_recurso_id")
	private FonteRecurso fonteRecurso;

	private Integer empenhoAno;

	@Enumerated(EnumType.STRING)
	private EmpenhoModalidade empenhoModalidade;

	private Integer empenhoNumero;

	private Integer subempenho;

	private String indicadorSubempenho;

	@ManyToOne
	@JoinColumn(name = "credor_id")
	private Credor credor;

	@ManyToOne
	@JoinColumn(name = "modalidade_licitacao_id")
	private ModalidadeLicitacao modalidadeLicitacao;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private BigDecimal valorEmpenhado;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private BigDecimal valorLiquidado;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
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

	public Orgao getOrgao() {
		return orgao;
	}

	public void setOrgao(Orgao orgao) {
		this.orgao = orgao;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public CategoriaEconomica getCategoriaEconomica() {
		return categoriaEconomica;
	}

	public void setCategoriaEconomica(CategoriaEconomica categoriaEconomica) {
		this.categoriaEconomica = categoriaEconomica;
	}

	public GrupoDespesa getGrupoDespesa() {
		return grupoDespesa;
	}

	public void setGrupoDespesa(GrupoDespesa grupoDespesa) {
		this.grupoDespesa = grupoDespesa;
	}

	public ModalidadeAplicacao getModalidadeAplicacao() {
		return modalidadeAplicacao;
	}

	public void setModalidadeAplicacao(ModalidadeAplicacao modalidadeAplicacao) {
		this.modalidadeAplicacao = modalidadeAplicacao;
	}

	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public Subelemento getSubelemento() {
		return subelemento;
	}

	public void setSubelemento(Subelemento subelemento) {
		this.subelemento = subelemento;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public Subfuncao getSubfuncao() {
		return subfuncao;
	}

	public void setSubfuncao(Subfuncao subfuncao) {
		this.subfuncao = subfuncao;
	}

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	public Acao getAcao() {
		return acao;
	}

	public void setAcao(Acao acao) {
		this.acao = acao;
	}

	public FonteRecurso getFonteRecurso() {
		return fonteRecurso;
	}

	public void setFonteRecurso(FonteRecurso fonteRecurso) {
		this.fonteRecurso = fonteRecurso;
	}

	public Integer getEmpenhoAno() {
		return empenhoAno;
	}

	public void setEmpenhoAno(Integer empenhoAno) {
		this.empenhoAno = empenhoAno;
	}

	public EmpenhoModalidade getEmpenhoModalidade() {
		return empenhoModalidade;
	}

	public void setEmpenhoModalidade(EmpenhoModalidade empenhoModalidade) {
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

	public Credor getCredor() {
		return credor;
	}

	public void setCredor(Credor credor) {
		this.credor = credor;
	}

	public ModalidadeLicitacao getModalidadeLicitacao() {
		return modalidadeLicitacao;
	}

	public void setModalidadeLicitacao(ModalidadeLicitacao modalidadeLicitacao) {
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DespesaOrcamentaria other = (DespesaOrcamentaria) obj;
		return Objects.equals(id, other.id);
	}

}
