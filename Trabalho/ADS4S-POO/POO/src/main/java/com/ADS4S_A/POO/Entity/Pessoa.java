package com.ADS4S_A.POO.Entity;

import jakarta.persistence.*;

@Entity
public class Pessoa {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private Integer idade;

    public Estudante() { }

    public String getNome() { return nome; }

    public String getEmail() { return email; }

    public Integer getIdade() { return idade; }

    public void setNome(String nome) { this.nome = nome; }

    public void setEmail(String email) { this.email = email; }

    public void setIdade(Integer idade) { this.idade = idade; }
}
