package br.com.udemy.microservices.hrpayroll.client;

import br.com.udemy.microservices.hrpayroll.domain.dto.WorkerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "hr-worker")
public interface WorkerClient {

    @GetMapping(value = "/{id}")
    ResponseEntity<WorkerDto> findById(@PathVariable long id);

    @GetMapping
    ResponseEntity<List<WorkerDto>> findAll();
}
