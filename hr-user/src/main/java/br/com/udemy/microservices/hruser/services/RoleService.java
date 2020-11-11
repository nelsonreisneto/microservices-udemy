package br.com.udemy.microservices.hruser.services;

import br.com.udemy.microservices.hruser.domain.dtos.RoleDto;
import br.com.udemy.microservices.hruser.domain.entities.RoleEntity;
import br.com.udemy.microservices.hruser.exceptions.RoleNotFoundException;
import br.com.udemy.microservices.hruser.mapper.RoleMapper;
import br.com.udemy.microservices.hruser.repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleDto getOneById(final Long id) {
        RoleEntity roleEntity = roleRepository.findById(id).orElseThrow(() -> new RoleNotFoundException("Usuario não encontrado!"));
        return RoleMapper.INSTANCE.toDto(roleEntity);
    }

}
