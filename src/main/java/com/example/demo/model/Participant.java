package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Participant {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     String fullName;
     String email;
     String phone;
     String username;
     String telegramId;
     String about;
     LocalDate birthDate;
     String city;
     String educationStatus;
     String institution;
     String faculty;
     String specialty;
     String course;

    @ManyToMany
    @JoinTable(
            name = "participant_training",
            joinColumns = @JoinColumn(name = "participant_id"),
            inverseJoinColumns = @JoinColumn(name = "training_id")
    )
    private List<Training> trainings;
}

