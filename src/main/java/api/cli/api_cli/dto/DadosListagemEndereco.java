package api.cli.api_cli.dto;

import api.cli.api_cli.model.Endereco;
import api.cli.api_cli.model.Pessoa;

public record DadosListagemEndereco(Long id,String logradouro, String cep, String numero, String cidade) {
    public DadosListagemEndereco(Endereco endereco){
        this(endereco.getId(), endereco.getLogradouro(), endereco.getCep(), endereco.getNumero(), endereco.getCidade());
    }
}
