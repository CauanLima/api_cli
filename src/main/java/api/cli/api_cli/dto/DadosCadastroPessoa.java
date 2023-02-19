package api.cli.api_cli.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public record DadosCadastroPessoa(
        @NotNull
        @NotBlank
        String nome,
        @NotNull
        @JsonFormat(pattern = "dd/MM/yyyy") LocalDate dataNascimento) {
}
