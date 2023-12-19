package br.william.testedevbackend.repositories;

import br.william.testedevbackend.entities.Client;
import br.william.testedevbackend.entities.HealthProblem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthProblemRepository extends JpaRepository<HealthProblem, Long> {
}
