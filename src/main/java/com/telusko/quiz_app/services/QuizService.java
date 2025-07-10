package com.telusko.quiz_app.services;

import com.telusko.quiz_app.dao.QuestionDao;
import com.telusko.quiz_app.dao.QuizDao;
import com.telusko.quiz_app.model.Question;
import com.telusko.quiz_app.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String>createQuiz(String category , int numQ , String quizTitle) {
        List<Question> questionList = questionDao.findRandomQuestionByCategory(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(quizTitle);
        quiz.setQuestions(questionList);

        quizDao.save(quiz);

        return new ResponseEntity<>("Success",HttpStatus.CREATED);
    }
}
