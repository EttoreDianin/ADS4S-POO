package com.ADS4S_A.POO.Service;

import com.ADS4S_A.POO.Entity.Pessoa;
import com.ADS4S_A.POO.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> findAll(){
        return pessoaRepository.findAll();
    }

    public Pessoa criarPessoa(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public void deletar(Long id){
        pessoaRepository.deleteById(id);
    }

    public Optional<Pessoa> findByID(Long id){
        return pessoaRepository.findById(id);
    }
}
