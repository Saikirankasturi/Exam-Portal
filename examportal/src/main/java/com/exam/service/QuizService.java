package com.exam.service;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;

import com.exam.model.exam.Category;
import com.exam.model.exam.Quiz;

public interface QuizService {
	public Quiz addQuiz(Quiz quiz);
	
	public Quiz updateQuiz(Quiz quiz);
	
	public Set<Quiz> getQuizes();
	
	public Quiz getQuiz(Long quizId);
	
	public void deleteQuiz(Long quizId);

	public List<Quiz> getQuizesOfCategory(Category category);
	
	public List<Quiz> getActiveQuizes();
	
	public List<Quiz> getActiveQuizesOfCategory(Category c);

		

}
