package com.despesasorcamentarias.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.despesasorcamentarias.domain.exception.EntidadeNaoEncontradaException;
import com.despesasorcamentarias.domain.model.DespesaOrcamentaria;
import com.despesasorcamentarias.domain.repository.AcaoRepository;
import com.despesasorcamentarias.domain.repository.CategoriaEconomicaRepository;
import com.despesasorcamentarias.domain.repository.CredorRepository;
import com.despesasorcamentarias.domain.repository.DespesaOrcamentariaRepository;
import com.despesasorcamentarias.domain.repository.ElementoRepository;
import com.despesasorcamentarias.domain.repository.FonteRecursoRepository;
import com.despesasorcamentarias.domain.repository.FuncaoRepository;
import com.despesasorcamentarias.domain.repository.GrupoDespesaRepository;
import com.despesasorcamentarias.domain.repository.ModalidadeAplicacaoRepository;
import com.despesasorcamentarias.domain.repository.ModalidadeLicitacaoRepository;
import com.despesasorcamentarias.domain.repository.OrgaoRepository;
import com.despesasorcamentarias.domain.repository.ProgramaRepository;
import com.despesasorcamentarias.domain.repository.SubelementoRepository;
import com.despesasorcamentarias.domain.repository.SubfuncaoRepository;
import com.despesasorcamentarias.domain.repository.UnidadeRepository;

import jakarta.transaction.Transactional;

@Service
public class DespesasOrcamentariasService {

	@Autowired
	private DespesaOrcamentariaRepository despesaOrcamentariaRepository;
	@Autowired
	private AcaoRepository acaoRepository;
	@Autowired
	private CategoriaEconomicaRepository categoriaEconomicaRepository;
	@Autowired
	private CredorRepository credorRepository;
	@Autowired
	private ElementoRepository elementoRepository;
	@Autowired
	private SubelementoRepository subelementoRepository;
	@Autowired
	private FonteRecursoRepository fonteRecursoRepository;
	@Autowired
	private FuncaoRepository funcaoRepository;
	@Autowired
	private SubfuncaoRepository subfuncaoRepository;
	@Autowired
	private GrupoDespesaRepository grupoDespesaRepository;
	@Autowired
	private ModalidadeAplicacaoRepository modalidadeAplicacaoRepository;
	@Autowired
	private ModalidadeLicitacaoRepository modalidadeLicitacaoRepository;
	@Autowired
	private OrgaoRepository orgaoRepository;
	@Autowired
	private UnidadeRepository unidadeRepository;
	@Autowired
	private ProgramaRepository programaRepository;

	@Transactional
	public List<DespesaOrcamentaria> registrarTodas(List<DespesaOrcamentaria> despesas) {

		for (DespesaOrcamentaria despesaOrcamentaria : despesas) {

			salvarOuAtualizarFilhos(despesaOrcamentaria);
		}

		return despesaOrcamentariaRepository.saveAll(despesas);
	}

	public List<DespesaOrcamentaria> buscarTodos() {
		return despesaOrcamentariaRepository.findAll();
	}
	
	public Page<DespesaOrcamentaria> buscarTodos(Pageable pageable) {
		return despesaOrcamentariaRepository.buscarTodos(pageable);
	}

	public boolean cadastroInexistente(Long id) {
		return !despesaOrcamentariaRepository.existsById(id);
	}

	@Transactional
	public void remover(Long id) {
		if (cadastroInexistente(id)) {
			throw new EntidadeNaoEncontradaException(
					String.format("Não existe um cadastro de despesa com códido %d", id));
		}
		despesaOrcamentariaRepository.deleteById(id);
	}

	@Transactional
	public DespesaOrcamentaria salvar(DespesaOrcamentaria despesaOrcamentaria) {
		despesaOrcamentariaRepository.detach(despesaOrcamentaria);
		
		salvarOuAtualizarFilhos(despesaOrcamentaria);

		return despesaOrcamentariaRepository.save(despesaOrcamentaria);
	}

	@Transactional
	private void salvarOuAtualizarFilhos(DespesaOrcamentaria despesaOrcamentaria) {
		if (despesaOrcamentaria.getAcao() != null) {
			acaoRepository.adicionarOuAtualizar(despesaOrcamentaria.getAcao());
		}

		if (despesaOrcamentaria.getCategoriaEconomica() != null) {
			categoriaEconomicaRepository.adicionarOuAtualizar(despesaOrcamentaria.getCategoriaEconomica());
		}

		if (despesaOrcamentaria.getCredor() != null) {
			credorRepository.adicionarOuAtualizar(despesaOrcamentaria.getCredor());
		}

		if (despesaOrcamentaria.getElemento() != null) {
			elementoRepository.adicionarOuAtualizar(despesaOrcamentaria.getElemento());
		}
		
		if (despesaOrcamentaria.getSubelemento() != null) {
			subelementoRepository.adicionarOuAtualizar(despesaOrcamentaria.getSubelemento());
		}
		
		if (despesaOrcamentaria.getFonteRecurso() != null) {
			fonteRecursoRepository.adicionarOuAtualizar(despesaOrcamentaria.getFonteRecurso());
		}

		if (despesaOrcamentaria.getFuncao() != null) {
			funcaoRepository.adicionarOuAtualizar(despesaOrcamentaria.getFuncao());
		}
		
		if (despesaOrcamentaria.getPrograma() != null) {
			programaRepository.adicionarOuAtualizar(despesaOrcamentaria.getPrograma());
		}	

		if (despesaOrcamentaria.getSubfuncao() != null) {
			subfuncaoRepository.adicionarOuAtualizar(despesaOrcamentaria.getSubfuncao());
		}

		if (despesaOrcamentaria.getGrupoDespesa() != null) {
			grupoDespesaRepository.adicionarOuAtualizar(despesaOrcamentaria.getGrupoDespesa());
		}

		if (despesaOrcamentaria.getModalidadeAplicacao() != null) {
			modalidadeAplicacaoRepository.adicionarOuAtualizar(despesaOrcamentaria.getModalidadeAplicacao());
		}

		if (despesaOrcamentaria.getModalidadeLicitacao() != null) {
			modalidadeLicitacaoRepository.adicionarOuAtualizar(despesaOrcamentaria.getModalidadeLicitacao());
		}

		if (despesaOrcamentaria.getOrgao() != null) {
			orgaoRepository.adicionarOuAtualizar(despesaOrcamentaria.getOrgao());
		}

		if (despesaOrcamentaria.getUnidade() != null) {

			unidadeRepository.adicionarOuAtualizar(despesaOrcamentaria.getUnidade());

			despesaOrcamentaria.getUnidade().setOrgao(despesaOrcamentaria.getOrgao());
		}
	}

	public DespesaOrcamentaria porId(Long despesaOrcamentariaId) {
		return despesaOrcamentariaRepository.findById(despesaOrcamentariaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException(
						String.format("Nenhuma despesa encontrada com código %d", despesaOrcamentariaId)));
	}
}
