package api.cli.api_cli.model;

import api.cli.api_cli.dto.DadosAtualizacaoPessoa;
import api.cli.api_cli.dto.DadosCadastroPessoa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@Table(name = "pessoas")
@Entity(name = "Pessoa")
public class Pessoa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate datanascimento;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Endereco> enderecos;



    public Pessoa(DadosCadastroPessoa dados) {
        this.nome = dados.nome();
        this.datanascimento = dados.dataNascimento();
    }
    public Pessoa(Long id) {
        this.id = id;
    }

    public void atualizarInformacoes(DadosAtualizacaoPessoa dados) {
        if (dados.nome() != null){
            this.nome = dados.nome();
        }
        if (dados.dataNascimento() != null) {
            this.datanascimento = dados.dataNascimento();
        }
    }
}
