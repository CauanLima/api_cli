package api.cli.api_cli.controller;

import api.cli.api_cli.dto.DadosAtualizacaoPessoa;
import api.cli.api_cli.dto.DadosCadastroPessoa;
import api.cli.api_cli.dto.DadosConsultarPessoa;
import api.cli.api_cli.dto.DadosListagemPessoa;
import api.cli.api_cli.model.Pessoa;
import api.cli.api_cli.repository.PessoaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("pessoa")
public class PessoaController {
    @Autowired
    private PessoaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPessoa dados){
        repository.save(new Pessoa(dados));
    }

    @GetMapping
    public Page<DadosListagemPessoa> listarPessoas(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPessoa::new);
    }

    @GetMapping
    @RequestMapping("consultar")
    public Optional<DadosListagemPessoa> consultarPessoa(@RequestBody @Valid DadosConsultarPessoa dados){
        return repository.findById(dados.id()).map(DadosListagemPessoa::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPessoa dados){
        Pessoa pessoa = repository.getReferenceById(dados.id());
        pessoa.atualizarInformacoes(dados);

    }
}
