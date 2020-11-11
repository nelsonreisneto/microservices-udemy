package br.com.udemy.microservices.hrworker.controller;

import br.com.udemy.microservices.hrworker.domain.dtos.WorkerDto;
import br.com.udemy.microservices.hrworker.mapper.WorkerMapper;
import br.com.udemy.microservices.hrworker.service.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
@RequiredArgsConstructor
@RefreshScope
public class WorkerController {

    private final WorkerService workerService;

    @GetMapping
    public ResponseEntity<List<WorkerDto>> findAll() {
        return ResponseEntity.ok().body(workerService.getAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<WorkerDto> findById(@PathVariable long id) {
        return ResponseEntity.ok().body(workerService.getOneById(id));
    }
}
