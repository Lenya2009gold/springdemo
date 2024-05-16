package com.example.demo.repository;

import com.example.demo.model.ExerciseParticipant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseParticipantRepository extends JpaRepository<ExerciseParticipant,Long> {
}
