package api.cli.api_cli.model;


import api.cli.api_cli.dto.DadosEndereco;
import api.cli.api_cli.model.Pessoa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@Table(name = "enderecos")
@Entity(name = "Endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logradouro;
    private String cep;
    private String numero;
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;


    public Endereco(DadosEndereco end, Pessoa pessoa) {
        this.logradouro = end.logradouro();
        this.cep = end.cep();
        this.numero = end.numero();
        this.pessoa = pessoa;
    }
}
