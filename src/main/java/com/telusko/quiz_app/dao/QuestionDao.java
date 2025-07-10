package com.telusko.quiz_app.dao;

import com.telusko.quiz_app.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {
    List<Question> findByCategoryIgnoreCase(String category);


}
