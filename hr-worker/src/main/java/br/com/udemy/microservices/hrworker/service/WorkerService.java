package br.com.udemy.microservices.hrworker.service;

import br.com.udemy.microservices.hrworker.domain.dtos.WorkerDto;
import br.com.udemy.microservices.hrworker.domain.entities.WorkerEntity;
import br.com.udemy.microservices.hrworker.domain.repositories.WorkerRepository;
import br.com.udemy.microservices.hrworker.exception.WorkerNotFoundException;
import br.com.udemy.microservices.hrworker.mapper.WorkerMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class WorkerService {

    private final WorkerRepository workerRepository;

    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    public WorkerDto getOneById(final Long id) {
        WorkerEntity workerEntity = workerRepository.getOneById(id).orElse(null);
        if (Objects.isNull(workerEntity)) {
            log.warn("Objeto worker não encontrado;");
            throw new WorkerNotFoundException();
        }
        return WorkerMapper.INSTANCE.toDto(workerEntity);
    }

    public List<WorkerEntity> getAll() {
        return workerRepository.findAll();
    }

}
