package com.amaan.quizapp.controller;

import com.amaan.quizapp.model.Question;
import com.amaan.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getStudents() {
        return questionService.getAllQuestions(); //Creating an object of Service Layer(Getting data from the service layer)
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }

    @GetMapping("/difficultyLevel/{difficultyLevel}")
    public List<Question> getQuestionsByDifficultyLevel(@PathVariable(value = "difficultyLevel") String difficultyLevel) {
        return questionService.getQuestionsByDifficultyLevel(difficultyLevel);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }
}
