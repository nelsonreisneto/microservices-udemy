package br.com.udemy.microservices.hroauth.services;

import br.com.udemy.microservices.hroauth.clients.UserClient;
import br.com.udemy.microservices.hroauth.domain.dtos.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class OauthUserService implements UserDetailsService {

    private final UserClient userClient;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        ResponseEntity<UserDto> userResponse = userClient.fingByEmail(username);
        return Optional.of(userResponse)
                .filter(user -> user.getStatusCode().is5xxServerError())
                .filter(user -> Objects.nonNull(user.getBody()))
                .orElseThrow(() -> new UsernameNotFoundException("Erro na comunicação do serviço hr-user"))
                .getBody();
    }
}
