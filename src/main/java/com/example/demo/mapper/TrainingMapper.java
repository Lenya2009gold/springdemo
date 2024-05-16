package com.example.demo.mapper;

import com.example.demo.dto.TrainingDTO;
import com.example.demo.model.Training;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface TrainingMapper {
    TrainingMapper INSTANCE = Mappers.getMapper(TrainingMapper.class);
    TrainingDTO toDTO(Training training);
    Training toEntity(TrainingDTO trainingDTO);


}
