package br.com.udemy.microservices.hrworker.mapper;

import br.com.udemy.microservices.hrworker.domain.dtos.WorkerDto;
import br.com.udemy.microservices.hrworker.domain.entities.WorkerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class WorkerMapper {
    public static final WorkerMapper INSTANCE = Mappers.getMapper(WorkerMapper.class);

    public abstract WorkerDto toDto(final WorkerEntity workerEntity);

    public abstract List<WorkerDto> toDtoList(final List<WorkerEntity> workerEntities);
}
