package br.william.testedevbackend.controllers;

import br.william.testedevbackend.dtos.HealthProblemDto;
import br.william.testedevbackend.services.HealthProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "health-problems")
public class HealthProblemController {

    @Autowired
    HealthProblemService healthProblemService;

    @GetMapping
    public ResponseEntity<List<HealthProblemDto>> searchForAllHealthProblems(){
        List<HealthProblemDto> list = healthProblemService.searchAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<HealthProblemDto> searchForHealthProblemsById(@PathVariable Long id){
        HealthProblemDto dto = healthProblemService.searchById(id);
        return ResponseEntity.ok().body(dto);
    }
}
