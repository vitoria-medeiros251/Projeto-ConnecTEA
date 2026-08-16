package com.connecTEA.connecTEA.controller;

import com.connecTEA.connecTEA.domain.ConnectTea;
import com.connecTEA.connecTEA.domain.Estabelecimento;
import com.connecTEA.connecTEA.domain.Servico;
import com.connecTEA.connecTEA.domain.User;
import com.connecTEA.connecTEA.service.ConnectTeaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("ConnectTEA")
public class ConnectTEAController {

    private final ConnectTeaService connectTeaService;

    @PostMapping("/ConnectTea")
    public ResponseEntity<ConnectTea> createConnectTea(@RequestBody ConnectTea connectTea) {
        ConnectTea createdConnectTea = connectTeaService.createConnectTea(connectTea);
        return ResponseEntity.ok(createdConnectTea);
    }
    @PostMapping("/service")
    public ResponseEntity<Servico> cadastrarServico(@RequestBody Servico servico) {
        Servico  createdServico = connectTeaService.cadastrarServico(servico);
        return ResponseEntity.ok(createdServico);
    }
    @PostMapping("/users")
    public ResponseEntity<User> cadastrarUser(@RequestBody User user) {
        User createdUser = connectTeaService.cadastrarUser(user);
        return ResponseEntity.ok(createdUser);
    }

    @PostMapping("/estabelecimento")
    public ResponseEntity<Estabelecimento> cadastrarEstabelecimento(@RequestBody Estabelecimento estabelecimento) {
        Estabelecimento createdEstabelecimento = connectTeaService.cadastrarEstabelecimento(estabelecimento);
        return ResponseEntity.ok(createdEstabelecimento);
    }

    @GetMapping("/ConnectTea")
    public ResponseEntity<List<ConnectTea>> findAll() {
        java.util.List<ConnectTea> list = connectTeaService.getAllConnectTea();
        return ResponseEntity.ok(list);
        }

        @GetMapping("/servico")
    public ResponseEntity<List<Servico>> findAllServicos() {
        List<Servico> list = connectTeaService.getAllServicos();
        return ResponseEntity.ok(list);
        }
        @GetMapping("/users")
        public ResponseEntity<List<User>> findAllUsers() {
        List<User> list = connectTeaService.getAllUsers();
        return ResponseEntity.ok(list);
        }
        @GetMapping("estabelecimento")
        public ResponseEntity<List<Estabelecimento>> findAllCadastroEstabelecimento() {
        List<Estabelecimento> list = connectTeaService.getAllCadastroEstabelecimento();
        return ResponseEntity.ok(list);
        }
    }





