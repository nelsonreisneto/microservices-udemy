package br.com.udemy.microservices.hrworker.domain.repositories;

import br.com.udemy.microservices.hrworker.domain.entities.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WorkerRepository extends JpaRepository<WorkerEntity, Long> {

    Optional<WorkerEntity> getOneById(Long id);
}
