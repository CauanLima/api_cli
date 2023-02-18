package api.cli.api_cli.controller;

import api.cli.api_cli.pessoa.DadosCadastroPessoa;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoa")
public class PessoaController {
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPessoa dados){
        System.out.println(dados);
    }
}
