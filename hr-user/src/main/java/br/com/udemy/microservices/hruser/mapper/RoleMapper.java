package br.com.udemy.microservices.hruser.mapper;

import br.com.udemy.microservices.hruser.domain.dtos.RoleDto;
import br.com.udemy.microservices.hruser.domain.entities.RoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class RoleMapper {
    public static final RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    public abstract RoleDto toDto(final RoleEntity roleEntity);

}
