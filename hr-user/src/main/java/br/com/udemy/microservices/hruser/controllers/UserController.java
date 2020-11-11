package br.com.udemy.microservices.hruser.controllers;

import br.com.udemy.microservices.hruser.domain.dtos.UserDto;
import br.com.udemy.microservices.hruser.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDto> findUserById(@PathVariable long id) {
        return ResponseEntity.ok().body(userService.getOneById(id));
    }

    @GetMapping(value = "/search")
    public ResponseEntity<UserDto> fingByEmail(@RequestParam String email) {
        return ResponseEntity.ok().body(userService.getOneByEmail(email));
    }
}
