package com.amaan.quizapp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "questions") //Was Necessary to use this, that's how I got my JSON in Browser and Postman
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//increase the ID by 1 automatically
    private Integer id;
    private String category;
    private String difficultyLevel;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String questionTitle;
    private String rightAnswer;
}
