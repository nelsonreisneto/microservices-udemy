package br.com.udemy.microservices.hrpayroll.domain.entities;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;

    private Double dailyIncome;
    private Integer days;
    private String name;

    private double getTotal() {
        return days * dailyIncome;
    }
}
