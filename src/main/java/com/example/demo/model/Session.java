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

public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
    @ManyToOne
    @JoinColumn(name = "training_id")
     Training training;

     String title;
     String description;
     String status;
     Boolean published;

    @OneToMany(mappedBy = "session")
     List<Exercise> exercises;
}
