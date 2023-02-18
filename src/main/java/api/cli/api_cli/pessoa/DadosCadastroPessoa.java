package api.cli.api_cli.pessoa;

import api.cli.api_cli.endereco.DadosEndereco;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public record DadosCadastroPessoa(String nome, @JsonFormat(pattern = "dd/mm/yyyy") Date dataNascimento, DadosEndereco endereco) {
}
