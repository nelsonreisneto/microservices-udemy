package br.com.udemy.microservices.hruser.services;

import br.com.udemy.microservices.hruser.domain.dtos.UserDto;
import br.com.udemy.microservices.hruser.domain.entities.UserEntity;
import br.com.udemy.microservices.hruser.exceptions.UserNotFoundException;
import br.com.udemy.microservices.hruser.mapper.UserMapper;
import br.com.udemy.microservices.hruser.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDto getOneById(final Long id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Usuario não encontrado!"));
        return UserMapper.INSTANCE.toDto(userEntity);
    }

    public UserDto getOneByEmail(final String email) {
        UserEntity userEntity = userRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException("Usuario não encontrado!"));
        return UserMapper.INSTANCE.toDto(userEntity);
    }
}
