package api.cli.api_cli.dto;

import api.cli.api_cli.model.Pessoa;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record DadosListagemPessoa(Long id,String nome, @JsonFormat(pattern = "dd/MM/yyyy") LocalDate dataNascimento ) {
    public DadosListagemPessoa(Pessoa pessoa){
        this(pessoa.getId(), pessoa.getNome(), pessoa.getDatanascimento());
    }
}
