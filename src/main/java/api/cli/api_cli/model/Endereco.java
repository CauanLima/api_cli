package api.cli.api_cli.model;


import api.cli.api_cli.dto.DadosCadastroEndereco;
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


    public Endereco(DadosCadastroEndereco end) {
        this.logradouro = end.logradouro();
        this.cep = end.cep();
        this.numero = end.numero();
        this.pessoa = new Pessoa(end.pessoa_id());
    }


}
