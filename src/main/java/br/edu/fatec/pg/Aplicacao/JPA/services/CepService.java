package br.edu.fatec.pg.Aplicacao.JPA.services;

import br.edu.fatec.pg.Aplicacao.JPA.models.Cep;
import br.edu.fatec.pg.Aplicacao.JPA.repository.CepRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {
    
    @Autowired
    private CepRepository cepRepository;

public Cep saveCep(Cep cep) {
    if (cep == null) {
        return null;
    }

    if (cepRepository.existsByCodigo(cep.getCodigo())) {
        return null;
    }
    return cepRepository.save(cep);
}

    public List<Cep> findAllCeps() {
        return cepRepository.findAll();
    }

}
