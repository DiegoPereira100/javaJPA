package br.edu.fatec.pg.Aplicacao.JPA.repository;

import br.edu.fatec.pg.Aplicacao.JPA.models.Cep;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CepRepository extends JpaRepository<Cep, Long> {
    boolean existsByCodigo(String codigo);
    
    Optional<Cep> findByCodigo(String codigo); }

