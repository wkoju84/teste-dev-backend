package br.william.testedevbackend.dtos;

import br.william.testedevbackend.entities.HealthProblem;

public class HealthProblemDto {

    private Long id;
    private String name;
    private Integer degreeOfTheProblem;

    public HealthProblemDto() {
    }

    public HealthProblemDto(Long id, String name, Integer degreeOfTheProblem) {
        this.id = id;
        this.name = name;
        this.degreeOfTheProblem = degreeOfTheProblem;
    }

    public HealthProblemDto(HealthProblem healthProblem) {
        this.id = healthProblem.getId();
        this.name = healthProblem.getName();
        this.degreeOfTheProblem = healthProblem.getDegreeOfTheProblem();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDegreeOfTheProblem() {
        return degreeOfTheProblem;
    }

    public void setDegreeOfTheProblem(Integer degreeOfTheProblem) {
        this.degreeOfTheProblem = degreeOfTheProblem;
    }
}
