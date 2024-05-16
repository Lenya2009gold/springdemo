package com.example.demo.service;

import com.example.demo.dto.ParticipantDTO;
import com.example.demo.mapper.ParticipantMapper;
import com.example.demo.model.Participant;
import com.example.demo.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ParticipantService {
    @Autowired
    private ParticipantRepository participantRepository;
    public List<ParticipantDTO> getAllParticipants()
    {
        return participantRepository.findAll().stream()
                .map(ParticipantMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }
    public ParticipantDTO createParticipant(ParticipantDTO participantDTO)
    {
        Participant participant = ParticipantMapper.INSTANCE.toEntity(participantDTO);
        Participant savedParticipant=participantRepository.save(participant);
        return ParticipantMapper.INSTANCE.toDTO(savedParticipant);
    }

}

