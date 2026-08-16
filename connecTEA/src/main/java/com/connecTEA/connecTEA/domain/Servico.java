package com.connecTEA.connecTEA.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "servicos")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String categoria;
    private String tipo;
    private String faixaEtaria; // Ex: "3-6", "adulto"
    private Boolean atendeOnline;
    private Boolean atendePresencial;
    private Double valorConsulta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profissional_id", nullable = false)
    private User profissional;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estabelecimento_id", nullable = false)
    private Estabelecimento estabelecimento;
}
