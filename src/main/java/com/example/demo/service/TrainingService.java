package com.example.demo.service;

import com.example.demo.dto.TrainingDTO;
import com.example.demo.mapper.TrainingMapper;
import com.example.demo.model.Training;
import com.example.demo.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class TrainingService {
    @Autowired
    private TrainingRepository trainingRepository;

    public List<TrainingDTO> getAllTrainings()
    {
        return trainingRepository.findAll().stream()
                .map(TrainingMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }
    public  TrainingDTO createTraining(TrainingDTO trainingDTO)
    {
        Training training = TrainingMapper.INSTANCE.toEntity(trainingDTO);
        Training savedTraining = trainingRepository.save(training);
        return TrainingMapper.INSTANCE.toDTO(savedTraining);
    }


}
