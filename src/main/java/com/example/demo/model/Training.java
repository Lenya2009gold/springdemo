package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;

     String title;
     String description;
     LocalDateTime startDate;
     LocalDateTime endDate;
     LocalDateTime registrationEndDate;
     String status;

    @OneToMany(mappedBy = "training")
     List<Session> sessions;
}
