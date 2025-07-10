package com.telusko.quiz_app.services;

import com.telusko.quiz_app.dao.QuestionDao;
import com.telusko.quiz_app.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<List<Question>>getAllQuestion(){
        try{
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public List<Question> getQuestionByCategory(String category) {
        return questionDao.findByCategoryIgnoreCase(category);
    }

    public ResponseEntity<Question> addQuestion(Question question){
        return new ResponseEntity<>(questionDao.save(question),HttpStatus.CREATED);
    }

    public void deleteQuestion(int questionID){
        questionDao.deleteById(questionID);
    }
}
