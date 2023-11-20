package paper_generator_application.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionStore {
	
	private List<Question> questions;

    public QuestionStore() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }

}
