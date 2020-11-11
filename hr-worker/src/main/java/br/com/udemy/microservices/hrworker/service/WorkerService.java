package br.com.udemy.microservices.hrworker.service;

import br.com.udemy.microservices.hrworker.domain.dtos.WorkerDto;
import br.com.udemy.microservices.hrworker.domain.entities.WorkerEntity;
import br.com.udemy.microservices.hrworker.domain.repositories.WorkerRepository;
import br.com.udemy.microservices.hrworker.exception.WorkerNotFoundException;
import br.com.udemy.microservices.hrworker.mapper.WorkerMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class WorkerService {

    private final WorkerRepository workerRepository;

    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    public WorkerDto getOneById(final Long id) {
        WorkerEntity workerEntity = workerRepository.getOneById(id).orElseThrow(() -> new WorkerNotFoundException("Worker não encontrado"));
        return WorkerMapper.INSTANCE.toDto(workerEntity);
    }

    public List<WorkerDto> getAll() {
        List<WorkerEntity> workerDtos = workerRepository.findAll();
        if(workerDtos.isEmpty()){
            log.warn("Lista de workers sem valores.");
            throw new WorkerNotFoundException();
        }
        return WorkerMapper.INSTANCE.toDtoList(workerDtos);
    }

}
