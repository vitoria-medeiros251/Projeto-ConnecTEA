package com.connecTEA.connecTEA.service;

import com.connecTEA.connecTEA.domain.ConnectTea;
import com.connecTEA.connecTEA.domain.Estabelecimento;
import com.connecTEA.connecTEA.domain.Servico;
import com.connecTEA.connecTEA.domain.User;
import com.connecTEA.connecTEA.repositorie.ConnectTeaRepository;
import com.connecTEA.connecTEA.repositorie.EstabelecimentoRepository;
import com.connecTEA.connecTEA.repositorie.ServicoRepository;
import com.connecTEA.connecTEA.repositorie.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConnectTeaService {
    private final ConnectTeaRepository connectTeaRepository;
    private final UserRepository userRepository;
    private final ServicoRepository servicoRepository;
    private final EstabelecimentoRepository estabelecimentoRepository;

    @Transactional
    public ConnectTea createConnectTea(ConnectTea connectTea) {

        return connectTeaRepository.save(connectTea);

    }

    public List<ConnectTea> getAllConnectTea() {
        return connectTeaRepository.findAll();
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public List<Estabelecimento> getAllCadastroEstabelecimento() {
        return estabelecimentoRepository.findAll();
    }
    public List<Servico> getAllServicos() {
        return servicoRepository.findAll();
    }


    @Transactional
    public Servico cadastrarServico(Servico servico) {
        return servicoRepository.save(servico);
    }
    @Transactional
    public User cadastrarUser(User user) {
        return userRepository.save(user);
    }
    @Transactional
    public Estabelecimento cadastrarEstabelecimento(Estabelecimento estabelecimento) {
        return estabelecimentoRepository.save(estabelecimento);
    }
}