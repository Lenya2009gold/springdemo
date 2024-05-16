package com.example.demo.controller;

import com.example.demo.dto.ParticipantDTO;
import com.example.demo.model.Participant;
import com.example.demo.service.ParticipantService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/participants")
public class ParticipantController {
    private final ParticipantService participantService;
    @GetMapping
    public List<ParticipantDTO> getAllParticipants()
    {
        return participantService.getAllParticipants();
    }
    @PostMapping
    public ParticipantDTO createParticipant(@RequestBody ParticipantDTO participantDTO)
    {
        return participantService.createParticipant(participantDTO);
    }
}
