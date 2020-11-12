package br.com.udemy.microservices.hruser.domain.dtos;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String email;
    private String password;

    @Builder.Default
    private Set<RoleDto> roleEntities = new HashSet<>();
}
