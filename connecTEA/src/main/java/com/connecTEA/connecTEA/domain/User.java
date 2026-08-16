package com.connecTEA.connecTEA.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String phone;
    @OneToMany(mappedBy = "profissional")
    private java.util.List<Servico> servicos;
}
