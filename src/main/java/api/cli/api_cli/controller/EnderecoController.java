package api.cli.api_cli.controller;


import api.cli.api_cli.dto.*;
import api.cli.api_cli.model.Endereco;
import api.cli.api_cli.repository.EnderecoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("endereco")
public class EnderecoController {
    @Autowired
    private EnderecoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroEndereco dados){
        repository.save(new Endereco(dados));
    }

    @GetMapping
    public List<DadosListagemEndereco> listarEnderecos(Pageable paginacao, @RequestBody DadosConsultaEndereco dados){
        return repository.findByPessoa_Id(dados.pessoa_id()).stream().map(DadosListagemEndereco::new).toList();
    }

    @GetMapping
    @RequestMapping("principal")
    public Optional<DadosListagemEndereco> listarEnderecoPrincipal(@RequestBody DadosConsultaEndereco dados){
        return repository.findByPrincipal(dados.pessoa_id()).map(DadosListagemEndereco::new);
    }
}
