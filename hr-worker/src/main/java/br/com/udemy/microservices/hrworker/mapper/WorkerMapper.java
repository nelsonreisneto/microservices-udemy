package br.com.udemy.microservices.hrworker.mapper;

import br.com.udemy.microservices.hrworker.domain.dtos.WorkerDto;
import br.com.udemy.microservices.hrworker.domain.entities.WorkerEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface WorkerMapper {

    WorkerDto toDto(final WorkerEntity workerEntity);

    List<WorkerDto> toDtoList(final List<WorkerEntity> workerEntities);
}
