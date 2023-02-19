package api.cli.api_cli.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        @NotNull
        String logradouro,

        @NotBlank
        @NotNull
        @Pattern(regexp = "\\d{8}")
        String cep,


        @NotBlank
        @NotNull
        String numero,

        @NotNull
        Long pessoa_id) {
}
