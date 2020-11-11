package br.com.udemy.microservices.hruser.repositories;

import br.com.udemy.microservices.hruser.domain.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}
