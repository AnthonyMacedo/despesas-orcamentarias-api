package com.despesasorcamentarias.api.v1.assembler.disassembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.input.DespesaOrcamentariaInput;
import com.despesasorcamentarias.domain.model.Acao;
import com.despesasorcamentarias.domain.model.CategoriaEconomica;
import com.despesasorcamentarias.domain.model.Credor;
import com.despesasorcamentarias.domain.model.DespesaOrcamentaria;
import com.despesasorcamentarias.domain.model.Elemento;
import com.despesasorcamentarias.domain.model.FonteRecurso;
import com.despesasorcamentarias.domain.model.Funcao;
import com.despesasorcamentarias.domain.model.GrupoDespesa;
import com.despesasorcamentarias.domain.model.ModalidadeAplicacao;
import com.despesasorcamentarias.domain.model.ModalidadeLicitacao;
import com.despesasorcamentarias.domain.model.Orgao;
import com.despesasorcamentarias.domain.model.Programa;
import com.despesasorcamentarias.domain.model.Subelemento;
import com.despesasorcamentarias.domain.model.Subfuncao;
import com.despesasorcamentarias.domain.model.Unidade;

@Component
public class DespesaOrcamentariaInputDisassembler {
	
	@Autowired
	private ModelMapper modelMapper;

	public DespesaOrcamentaria toDomainObject(DespesaOrcamentariaInput despesaOrcamentariaInput) {
		
//		if (despesaOrcamentariaInput.getEmpenhoModalidade() != null) {
//			TypeMap<String, EmpenhoModalidade> stringToFormaPagamento = modelMapper.createTypeMap(String.class, EmpenhoModalidade.class);
//			stringToFormaPagamento.setConverter(stringValue -> EmpenhoModalidade.valueOf(stringValue.getSource().toUpperCase()));
//		}
		
		return modelMapper.map(despesaOrcamentariaInput, DespesaOrcamentaria.class);
	}

	public void copyToDomainObject(DespesaOrcamentariaInput despesaOrcamentariaInput, DespesaOrcamentaria despesaOrcamentaria) {
		
		prepareUpdate(despesaOrcamentaria);
		
		modelMapper.map(despesaOrcamentariaInput, despesaOrcamentaria);
	}

	private void prepareUpdate(DespesaOrcamentaria despesaOrcamentaria) {
		despesaOrcamentaria.setOrgao(new Orgao());
		despesaOrcamentaria.setAcao(new Acao());
		despesaOrcamentaria.setCategoriaEconomica(new CategoriaEconomica());
		despesaOrcamentaria.setFuncao(new Funcao());
		despesaOrcamentaria.setElemento(new Elemento());
		despesaOrcamentaria.setCredor(new Credor());
		despesaOrcamentaria.setFonteRecurso(new FonteRecurso());
		despesaOrcamentaria.setSubelemento(new Subelemento());
		despesaOrcamentaria.setSubfuncao(new Subfuncao());
		despesaOrcamentaria.setUnidade(new Unidade());
		despesaOrcamentaria.setModalidadeAplicacao(new ModalidadeAplicacao());
		despesaOrcamentaria.setModalidadeLicitacao(new ModalidadeLicitacao());
		despesaOrcamentaria.setPrograma(new Programa());
		despesaOrcamentaria.setGrupoDespesa(new GrupoDespesa());
		despesaOrcamentaria.getUnidade().setOrgao(null);
	}
}
