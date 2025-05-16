package services;

import java.util.List;

import entities.Question;

public interface QuestionService {
	
	Question create(Question question);
	
	List<Question> get();
	Question getOne(Long id);

	List<Question> getQuestionsOfQuiz(Long quizId);

}
