package com.example.demo.mapper;

import com.example.demo.dto.ParticipantDTO;
import com.example.demo.model.Participant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ParticipantMapper {
    ParticipantMapper INSTANCE = Mappers.getMapper(ParticipantMapper.class);
    ParticipantDTO toDTO(Participant participant);
    Participant toEntity(ParticipantDTO participantDTO);
}
