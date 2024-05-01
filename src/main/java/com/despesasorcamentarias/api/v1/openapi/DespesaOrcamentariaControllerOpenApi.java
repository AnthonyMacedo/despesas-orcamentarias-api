package com.despesasorcamentarias.api.v1.openapi;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;

import com.despesasorcamentarias.api.v1.model.DespesaOrcamentariaModel;
import com.despesasorcamentarias.api.v1.model.input.DespesaOrcamentariaInput;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(name = "Despesas Orçamentarias" )
public interface DespesaOrcamentariaControllerOpenApi {

	@Operation(summary = "Cadastra uma nova despesa orçamentaria", responses = @ApiResponse(responseCode = "201"))
	DespesaOrcamentariaModel adicionar(@RequestBody(description = "Representação de uma nova despesa", required = true)DespesaOrcamentariaInput despesaOrcamentariaInput);
	
	@Operation(summary = "Lista paginável das despesas orçamentarias")
	Page<DespesaOrcamentariaModel> buscarTodos(Pageable pageable);
	
	@Operation(summary = "Excluir uma despesa orçamentaria por ID", responses = @ApiResponse(responseCode = "204"))
	public void remover(@PathVariable("despesaOrcamentariaId") Long despesaOrcamentariaId);
	
	@Operation(summary = "Atualiza despesa orçamentaria a partir do ID")
	DespesaOrcamentariaModel atualizar(@PathVariable Long despesaOrcamentariaId, 
			@RequestBody(description = "Representação de uma despesa com dados atualizados", required = true)  @Valid DespesaOrcamentariaInput despesaOrcamentariaInput);
}
