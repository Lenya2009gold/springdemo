package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class ExerciseParticipant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
    @ManyToOne
    @JoinColumn(name = "exercise_id")
     Exercise exercise;

    @ManyToOne
    @JoinColumn(name = "participant_id")
     Participant participant;

     String status;
     String comment;
     String lastCommitUrl;
}
