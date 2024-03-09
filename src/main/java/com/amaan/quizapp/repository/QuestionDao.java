package com.amaan.quizapp.repository;

import com.amaan.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> { //What type of data are we working with and the type of primary key

   List<Question> findByCategory(String category);
}
