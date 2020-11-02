package br.com.udemy.microservices.hrpayroll.service;

import br.com.udemy.microservices.hrpayroll.domain.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long id, int days) {
        return Payment.builder().build();
    }
}
