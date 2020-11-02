package br.com.udemy.microservices.hrpayroll.controller;

import br.com.udemy.microservices.hrpayroll.domain.entities.Payment;
import br.com.udemy.microservices.hrpayroll.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> get(@PathVariable Long workerId, @PathVariable Integer days) {
        Payment returnPayment = paymentService.getPayment(workerId, days);
        return ResponseEntity.ok().body(returnPayment);
    }
}
