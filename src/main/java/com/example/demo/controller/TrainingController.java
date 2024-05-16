package com.example.demo.controller;

import com.example.demo.dto.TrainingDTO;
import com.example.demo.model.Training;
import com.example.demo.service.TrainingService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/trainings")

public class TrainingController {

    private final TrainingService trainingService;
    @GetMapping
    public List<TrainingDTO> getlAllTrainings()
    {
        return trainingService.getAllTrainings();
    }
    @PostMapping
    public TrainingDTO createTraining(@RequestBody TrainingDTO trainingDTO) {
        return trainingService.createTraining(trainingDTO);
    }
}
