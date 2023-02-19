CREATE TABLE pessoas(
    id BIGINT NOT NULL auto_increment unique,
    nome VARCHAR(200) NOT NULL,
    dataNascimento date NOT NULL
)