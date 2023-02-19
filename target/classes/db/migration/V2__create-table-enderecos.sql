CREATE TABLE enderecos(
    id BIGINT NOT NULL auto_increment unique,
    logradouro VARCHAR(200) NOT NULL,
    cep VARCHAR(20) NOT NULL,
    numero VARCHAR(100) NOT NULL,
    pessoa_id bigint not null
)