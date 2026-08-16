package com.connecTEA.connecTEA.repositorie;

import com.connecTEA.connecTEA.domain.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
    List<Servico> findByCategoriaIgnoreCaseAndEstabelecimento_CidadeIgnoreCase(String categoria, String cidade);
}
