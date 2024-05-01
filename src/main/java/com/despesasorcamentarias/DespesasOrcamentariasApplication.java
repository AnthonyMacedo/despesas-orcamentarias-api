package com.despesasorcamentarias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.despesasorcamentarias.infrastructure.repository.CustomJpaRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomJpaRepositoryImpl.class)
public class DespesasOrcamentariasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DespesasOrcamentariasApplication.class, args);
	}

}
