package com.example.demo.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class ParticipantDTO {
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

}
