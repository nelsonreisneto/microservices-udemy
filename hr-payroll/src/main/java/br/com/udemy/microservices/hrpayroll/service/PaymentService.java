package br.com.udemy.microservices.hrpayroll.service;

import br.com.udemy.microservices.hrpayroll.client.WorkerClient;
import br.com.udemy.microservices.hrpayroll.domain.dto.WorkerDto;
import br.com.udemy.microservices.hrpayroll.domain.entities.Payment;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PaymentService {

    private final WorkerClient workerClient;

    public PaymentService(WorkerClient workerClient) {
        this.workerClient = workerClient;
    }

    public Payment getPayment(Long id, int days) {
        WorkerDto workerDto = Objects.requireNonNull(workerClient.findById(id).getBody());

        return Payment.builder()
                .name(workerDto.getName())
                .dailyIncome(workerDto.getDailyIncome())
                .days(days)
                .build();
    }
}
