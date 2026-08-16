package com.connecTEA.connecTEA.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "estabelecimento")
public class Estabelecimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstabelecimento;
    private String nome;
    private String tipo;
    private String endereco;
    private String cidade;
    private String cep;
    private String complemento;
    private String bairro;
    private Integer numero;
    @OneToMany(mappedBy = "estabelecimento")
    private java.util.List<Servico> servicos;
}
