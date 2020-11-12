package br.com.udemy.microservices.hruser.services.impl;

import br.com.udemy.microservices.hruser.domain.dtos.UserDto;
import br.com.udemy.microservices.hruser.domain.entities.UserEntity;
import br.com.udemy.microservices.hruser.exceptions.UserNotFoundException;
import br.com.udemy.microservices.hruser.mapper.UserMapper;
import br.com.udemy.microservices.hruser.repositories.UserRepository;
import br.com.udemy.microservices.hruser.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDto getOneById(final Long id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Usuario não encontrado!"));
        return UserMapper.INSTANCE.toDto(userEntity);
    }

    @Override
    public UserDto getOneByEmail(final String email) {
        UserEntity userEntity = userRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException("Usuario não encontrado!"));
        return UserMapper.INSTANCE.toDto(userEntity);
    }
}
