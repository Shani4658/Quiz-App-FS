package com.telusko.quiz_app.services;

import com.telusko.quiz_app.dao.QuestionDao;
import com.telusko.quiz_app.dao.QuizDao;
import com.telusko.quiz_app.model.Question;
import com.telusko.quiz_app.model.Quiz;
import com.telusko.quiz_app.model.QuizWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public ResponseEntity<List<QuizWrapper>>getQuizQuestions(int quizId){
        Optional<Quiz> quiz = quizDao.findById(quizId);
        List<Question> questionsFromDB = quiz.get().getQuestions();
        List<QuizWrapper> questionsForUser = new ArrayList<>();
        for(Question q : questionsFromDB){
            QuizWrapper qw = new QuizWrapper();
            qw.setId(q.getId());
            qw.setQuestionTitle(q.getQuestionTitle());
            qw.setOption1(q.getOption1());
            qw.setOption2(q.getOption2());
            qw.setOption3(q.getOption3());
            qw.setOption4(q.getOption4());

            questionsForUser.add(qw);

        }
        return new ResponseEntity<>(questionsForUser,HttpStatus.OK);
    }
}
