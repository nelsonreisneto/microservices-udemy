package br.com.udemy.microservices.hruser.mapper;

import br.com.udemy.microservices.hruser.domain.dtos.UserDto;
import br.com.udemy.microservices.hruser.domain.entities.UserEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {

    UserDto toDto(final UserEntity userEntity);

}
