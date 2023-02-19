package api.cli.api_cli.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosAtualizacaoPessoa(
        @NotNull
        Long id,
        String nome,
        @JsonFormat(pattern = "dd/MM/yyyy") LocalDate dataNascimento) {
}
