package br.com.udemy.microservices.hrworker.domain.dtos;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class WorkerDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private double dailyIncome;
}
