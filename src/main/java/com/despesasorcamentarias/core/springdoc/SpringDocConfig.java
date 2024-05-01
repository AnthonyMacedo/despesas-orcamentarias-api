package com.despesasorcamentarias.core.springdoc;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;

@Configuration
public class SpringDocConfig {

	@Bean
	OpenAPI openAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Despesas Orçamentarias API")
						.version("v1")
						.description("Aplicação Rest que consome uma API que retorna as despesas orçamentarias de Recife e insere esses os dados obtidos em uma base de dados.")
					  )
				.tags(
						Arrays.asList(
								new Tag().name("Despesas Orçamentarias").description("Controle das despesas"),
								new Tag().name("Service Consumer").description("Consome a API de Recife e persiste os dados recebidos em uma base de dados."))
								
					  )
				.externalDocs(new ExternalDocumentation()
						.description("Link da API de Recife com limit de 100 registros")
						.url("http://dados.recife.pe.gov.br/api/3/action/datastore_search?resource_id=d4d8a7f0-d4be-4397-b950-f0c991438111&limit=100"));
	}
	
}
