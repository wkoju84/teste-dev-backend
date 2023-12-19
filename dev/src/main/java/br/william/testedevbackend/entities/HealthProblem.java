package br.william.testedevbackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_health_problem")
public class HealthProblem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer degreeOfTheProblem;

    public HealthProblem() {
    }

    public HealthProblem(Long id, String name, Integer degreeOfTheProblem) {
        this.id = id;
        this.name = name;
        this.degreeOfTheProblem = degreeOfTheProblem;
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
