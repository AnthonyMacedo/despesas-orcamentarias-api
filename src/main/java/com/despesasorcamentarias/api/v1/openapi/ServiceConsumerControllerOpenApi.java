package com.despesasorcamentarias.api.v1.openapi;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Service Consumer" )
public interface ServiceConsumerControllerOpenApi {

	@Operation(summary = "Consome a API de recife e persiste os dados recebidos com limit de 100 em uma base de dados", 
				responses = @ApiResponse(responseCode = "201"))
	public void obterDespesasOrcamentariasRecifeEPersistirNaBaseDeDados();
}
