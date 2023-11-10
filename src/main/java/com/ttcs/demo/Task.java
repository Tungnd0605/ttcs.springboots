package com.ttcs.demo;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String title;

    private String description;

    @CreationTimestamp
    private LocalDateTime startedDate;

    @NonNull
    private LocalDateTime dueDate;

    private boolean isCompleted = false;
}