package br.com.udemy.microservices.hroauth.clients;

import br.com.udemy.microservices.hroauth.domain.dtos.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "HR-USER", path = "/users")
public interface UserClient {

    @GetMapping(value = "/search")
    ResponseEntity<UserDto> fingByEmail(@RequestParam String email);

}
