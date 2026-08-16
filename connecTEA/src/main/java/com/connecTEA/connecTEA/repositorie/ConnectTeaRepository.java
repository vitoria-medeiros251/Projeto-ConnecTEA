package com.connecTEA.connecTEA.repositorie;

import com.connecTEA.connecTEA.domain.ConnectTea;
import com.connecTEA.connecTEA.domain.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ConnectTeaRepository extends JpaRepository<ConnectTea, Long> {
    Optional<ConnectTea> findById(Long id);
}

