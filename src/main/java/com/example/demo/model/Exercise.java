package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
    @ManyToOne
    @JoinColumn(name="session_id")
     Session session;

     String title;
     String referenceRepository;

    @OneToMany(mappedBy = "exercise")
     List<ExerciseParticipant> exerciseParticipants;
}
