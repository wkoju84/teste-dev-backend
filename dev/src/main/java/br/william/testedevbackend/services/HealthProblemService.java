package br.william.testedevbackend.services;

import br.william.testedevbackend.dtos.ClientDto;
import br.william.testedevbackend.dtos.HealthProblemDto;
import br.william.testedevbackend.entities.Client;
import br.william.testedevbackend.entities.HealthProblem;
import br.william.testedevbackend.repositories.ClientRepository;
import br.william.testedevbackend.repositories.HealthProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HealthProblemService {

    @Autowired
    private HealthProblemRepository healthProblemRepository;

    public List<HealthProblemDto> searchAll(){
        List<HealthProblem> list = healthProblemRepository.findAll();
        return list.stream().map(HealthProblemDto::new).collect(Collectors.toList());
    }

    public HealthProblemDto searchById(Long id){
        Optional<HealthProblem> object = healthProblemRepository.findById(id);
        HealthProblem entity = object.get();
        return new HealthProblemDto(entity);
    }
}
