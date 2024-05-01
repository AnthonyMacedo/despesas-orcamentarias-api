

-- api.acao definition

-- Drop table

-- DROP TABLE api.acao;

CREATE TABLE api.acao (
	id bigint NOT NULL,
	nome varchar(120) NULL,
	CONSTRAINT acao_pkey PRIMARY KEY (id)
);

-- api.categoria_economica definition

-- Drop table

-- DROP TABLE api.categoria_economica;

CREATE TABLE api.categoria_economica (
	id bigint NOT NULL,
	nome varchar(120) NULL,
	CONSTRAINT categoria_economica_pkey PRIMARY KEY (id)
);

-- api.credor definition

-- Drop table

-- DROP TABLE api.credor;

CREATE TABLE api.credor (
	id bigint NOT NULL,
	nome varchar(120) NULL,
	CONSTRAINT credor_pkey PRIMARY KEY (id)
);

-- api.elemento definition

-- Drop table

-- DROP TABLE api.elemento;

CREATE TABLE api.elemento (
	id bigint NOT NULL,
	nome varchar(120) NULL,
	CONSTRAINT elemento_pkey PRIMARY KEY (id)
);

-- api.fonte_recurso definition

-- Drop table

-- DROP TABLE api.fonte_recurso;

CREATE TABLE api.fonte_recurso (
	id bigint NOT NULL,
	nome varchar(120) NULL,
	CONSTRAINT fonte_recurso_pkey PRIMARY KEY (id)
);

-- api.funcao definition

-- Drop table

-- DROP TABLE api.funcao;

CREATE TABLE api.funcao (
	id bigint NOT NULL,
	nome varchar(120) NULL,
	CONSTRAINT funcao_pkey PRIMARY KEY (id)
);

-- api.grupo_despesa definition

-- Drop table

-- DROP TABLE api.grupo_despesa;

CREATE TABLE api.grupo_despesa (
	id bigint NOT NULL,
	nome varchar(120) NULL,
	CONSTRAINT grupo_despesa_pkey PRIMARY KEY (id)
);

-- api.modalidade_aplicacao definition

-- Drop table

-- DROP TABLE api.modalidade_aplicacao;

CREATE TABLE api.modalidade_aplicacao (
	id bigint NOT NULL,
	nome varchar(120) NULL,
	CONSTRAINT modalidade_aplicacao_pkey PRIMARY KEY (id)
);

-- api.modalidade_licitacao definition

-- Drop table

-- DROP TABLE api.modalidade_licitacao;

CREATE TABLE api.modalidade_licitacao (
	id bigint NOT NULL,
	nome varchar(120) NULL,
	CONSTRAINT modalidade_licitacao_pkey PRIMARY KEY (id)
);

-- api.orgao definition

-- Drop table

-- DROP TABLE api.orgao;

CREATE TABLE api.orgao (
	id bigint NOT NULL,
	nome varchar(120) NULL,
	CONSTRAINT orgao_pkey PRIMARY KEY (id)
);

-- api.unidade definition

-- Drop table

-- DROP TABLE api.unidade;

CREATE TABLE api.unidade (
	id bigint NOT NULL,
	orgao_id bigint NULL,
	nome varchar(120) NULL,
	CONSTRAINT unidade_pkey PRIMARY KEY (id),
	CONSTRAINT fk_unidade_orgao_id FOREIGN KEY (orgao_id) REFERENCES api.orgao(id)
);

-- api.programa definition

-- Drop table

-- DROP TABLE api.programa;

CREATE TABLE api.programa (
	id bigint NOT NULL,
	nome varchar(120) NULL,
	CONSTRAINT programa_pkey PRIMARY KEY (id)
);

-- api.subelemento definition

-- Drop table

-- DROP TABLE api.subelemento;

CREATE TABLE api.subelemento (
	id bigint NOT NULL,
	nome varchar(120) NULL,
	CONSTRAINT subelemento_pkey PRIMARY KEY (id)
);

-- api.subfuncao definition

-- Drop table

-- DROP TABLE api.subfuncao;

CREATE TABLE api.subfuncao (
	id bigint NOT NULL,
	nome varchar(120) NULL,
	CONSTRAINT subfuncao_pkey PRIMARY KEY (id)
);

-- api.despesa_orcamentaria definition

-- Drop table

-- DROP TABLE api.despesa_orcamentaria;

CREATE TABLE api.despesa_orcamentaria (
	id bigserial NOT NULL,
	ano_movimentacao integer NULL,
	mes_movimentacao integer NULL,
	empenho_ano integer NULL,
	empenho_numero integer NULL,
	subempenho integer NULL,
	valor_empenhado numeric(20, 2) NULL,
	valor_liquidado numeric(20, 2) NULL,
	valor_pago numeric(20, 2) NULL,
	acao_id bigint NULL,
	categoria_economica_id bigint NULL,
	credor_id bigint NULL,
	elemento_id bigint NULL,
	fonte_recurso_id bigint NULL,
	funcao_id bigint NULL,
	grupo_despesa_id bigint NULL,
	modalidade_aplicacao_id bigint NULL,
	modalidade_licitacao_id bigint NULL,
	orgao_id bigint NULL,
	programa_id bigint NULL,
	subelemento_id bigint NULL,
	subfuncao_id bigint NULL,
	unidade_id bigint NULL,
	empenho_modalidade varchar(80) NULL,
	indicador_subempenho varchar(255) NULL,
	CONSTRAINT despesa_orcamentaria_pkey PRIMARY KEY (id)
);