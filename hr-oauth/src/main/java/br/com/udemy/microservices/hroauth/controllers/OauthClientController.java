/*
package br.com.udemy.microservices.hroauth.controllers;

import br.com.udemy.microservices.hroauth.domain.dtos.UserDto;
import br.com.udemy.microservices.hroauth.services.OauthUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class OauthClientController {

    private final OauthUserService oauthUserService;

    @GetMapping(value = "/search")
    public ResponseEntity<UserDto> fingByEmail(@RequestParam String email) {
        return ResponseEntity.ok().body(oauthUserService.loadUserByUsername(email));
    }
}
*/
