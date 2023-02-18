package api.cli.api_cli.controller;

import api.cli.api_cli.pessoa.DadosCadastroPessoa;
import api.cli.api_cli.pessoa.Pessoa;
import api.cli.api_cli.pessoa.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoa")
public class PessoaController {
    @Autowired
    private PessoaRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPessoa dados){
        repository.save(new Pessoa(dados));
    }
}
