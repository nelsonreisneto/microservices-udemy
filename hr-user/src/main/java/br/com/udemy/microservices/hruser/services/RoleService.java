package br.com.udemy.microservices.hruser.services;

import br.com.udemy.microservices.hruser.domain.dtos.RoleDto;

public interface RoleService {

    RoleDto getOneById(final Long id);
}
