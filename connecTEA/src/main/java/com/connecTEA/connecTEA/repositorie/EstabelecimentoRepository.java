package com.connecTEA.connecTEA.repositorie;

import com.connecTEA.connecTEA.domain.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
    List<Estabelecimento> findByCidadeIgnoreCase(String cidade);
    List<Estabelecimento> findByTipoIgnoreCase(String tipo);
}
