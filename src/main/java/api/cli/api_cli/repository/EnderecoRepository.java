package api.cli.api_cli.repository;

import api.cli.api_cli.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    @Query(value = "SELECT * FROM enderecos WHERE pessoa_id = ?1", nativeQuery = true)
    List<Endereco> findByPessoa_Id(Long pessoa_id);

    @Query(value = "SELECT * FROM enderecos WHERE pessoa_id = ?1 and endereco_principal = 1", nativeQuery = true)
    Optional<Endereco> findByPrincipal(Long pessoa_id);
}
