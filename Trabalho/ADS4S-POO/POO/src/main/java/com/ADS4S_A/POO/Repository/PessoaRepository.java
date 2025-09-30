package com.ADS4S_A.POO.Repository;

import com.ADS4S_A.POO.Entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository< Pessoa, Long> {
}
