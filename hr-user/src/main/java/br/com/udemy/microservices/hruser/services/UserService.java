package br.com.udemy.microservices.hruser.services;

import br.com.udemy.microservices.hruser.domain.dtos.UserDto;

public interface UserService {

    UserDto getOneById(final Long id);

    UserDto getOneByEmail(final String email);
}
