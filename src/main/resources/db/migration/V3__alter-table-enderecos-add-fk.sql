ALTER TABLE enderecos
ADD FOREIGN KEY (pessoa_id)
REFERENCES pessoas(id)