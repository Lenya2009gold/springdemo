package com.example.demo.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TrainingDTO {
     Long id;
     String title;
     String description;
     LocalDateTime startDate;
     LocalDateTime endDate;
     LocalDateTime registrationEndDate;
     String status;
}
