package br.com.udemy.microservices.hroauth.domain.dtos;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class RoleDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String roleName;
}
