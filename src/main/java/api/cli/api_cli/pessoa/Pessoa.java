package api.cli.api_cli.pessoa;

import api.cli.api_cli.endereco.DadosEndereco;
import api.cli.api_cli.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
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
    private Date dataNascimento;

    //@OneToMany(mappedBy = "pessoa")
    //private List<Endereco> enderecos;


    public Pessoa(DadosCadastroPessoa dados) {
        //List<Endereco> enderecos2 = new List<Endereco>();
        this.nome = dados.nome();
        this.dataNascimento = dados.dataNascimento();
        //this.enderecos = new Endereco(dados.endereco());

    }
}
