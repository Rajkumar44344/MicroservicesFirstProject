package services;

import java.util.List;

import entities.Quiz;

public interface QuizService {
	Quiz add(Quiz quiz);
	
	List<Quiz>get();
	
	Quiz get(Long id);

}
