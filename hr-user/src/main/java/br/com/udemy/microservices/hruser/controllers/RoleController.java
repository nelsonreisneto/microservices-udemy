package br.com.udemy.microservices.hruser.controllers;

import br.com.udemy.microservices.hruser.domain.dtos.RoleDto;
import br.com.udemy.microservices.hruser.domain.dtos.UserDto;
import br.com.udemy.microservices.hruser.services.RoleService;
import br.com.udemy.microservices.hruser.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
@RefreshScope
public class RoleController {

    private final RoleService roleService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<RoleDto> findById(@PathVariable long id) {
        return ResponseEntity.ok().body(roleService.getOneById(id));
    }
}
