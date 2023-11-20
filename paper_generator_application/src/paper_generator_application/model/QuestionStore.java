package paper_generator_application.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionStore {
	
	// List to store questions
	private List<Question> questions;

	// Constructor to initialize the list
    public QuestionStore() {
        this.questions = new ArrayList<>();
    }

    // Method to add a question to the list
    public void addQuestion(Question question) {
        questions.add(question);
    }

    // Method to get all questions from the list
    public List<Question> getQuestions() {
        return questions;
    }

}
