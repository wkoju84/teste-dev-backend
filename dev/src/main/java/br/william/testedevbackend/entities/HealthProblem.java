package br.william.testedevbackend.entities;

import java.util.Date;

public class HealthProblem {

    private String name;

    private Integer degreeOfTheProblem;

    public HealthProblem() {
    }

    public HealthProblem(String name, Integer degreeOfTheProblem) {
        this.name = name;
        this.degreeOfTheProblem = degreeOfTheProblem;
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
