package br.william.testedevbackend.dtos;

import br.william.testedevbackend.entities.Client;
import br.william.testedevbackend.entities.HealthProblem;


import java.time.LocalDate;
import java.util.Date;

public class ClientDto {

    private Long id;
    private String name;
    private Date dateOfBirth;
    private String gender;

    private HealthProblem healthProblem;
    private LocalDate creationDate;
    private LocalDate updateDate;

    public ClientDto() {
    }

    public ClientDto(Long id, String name, Date dateOfBirth, String gender, HealthProblem healthProblem,
                     LocalDate creationDate, LocalDate updateDate) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.healthProblem = healthProblem;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }

    public ClientDto(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.dateOfBirth = client.getDateOfBirth();
        this.gender = client.getGender();
        this.healthProblem = client.getHealthProblem();
        this.creationDate = client.getCreationDate();
        this.updateDate = client.getUpdateDate();
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public HealthProblem getHealthProblem() {
        return healthProblem;
    }

    public void setHealthProblem(HealthProblem healthProblem) {
        this.healthProblem = healthProblem;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}
