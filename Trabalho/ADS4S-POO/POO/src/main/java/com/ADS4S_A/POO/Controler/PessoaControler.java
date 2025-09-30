package com.ADS4S_A.POO.Controler;

import com.ADS4S_A.POO.Service.PessoaService;
import com.ADS4S_A.POO.Entity.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pessoas")
public class EstudanteControler {
    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> findAll(){
        return pessoaService.findAll();
    }

    @PostMapping
    public Pessoa criar(@RequestBody Pessoa pessoa){
        return pessoaService.criarPessoa(pessoa);
    }

    @DeleteMapping
    public void deletar(@PathVariable Long id){
        pessoaService.deletar(id);
    }

    @GetMapping
    public Optional<Pessoa> findByID(@PathVariable Long id){
        return pessoaService.findByID(id);
    }
}
