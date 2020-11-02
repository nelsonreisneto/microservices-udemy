package br.com.udemy.microservices.hrworker.domain.repositories;

import br.com.udemy.microservices.hrworker.domain.entities.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<WorkerEntity, Long> {
}
