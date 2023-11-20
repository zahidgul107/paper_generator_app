package paper_generator_application;

import java.util.List;

import paper_generator_application.model.Question;
import paper_generator_application.model.QuestionPaperGenerator;
import paper_generator_application.model.QuestionStore;

public class QuestionPaperApp {

	public static void main(String[] args) {

		System.err.println("hello world!");

		// Create questions and add them to the question store
		QuestionStore questionStore = new QuestionStore();
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Easy", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Easy", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Easy", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Easy", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Easy", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Medium", 20));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Medium", 20));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Medium", 20));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Medium", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Medium", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Medium", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Medium", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Medium", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Hard", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Hard", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Hard", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Hard", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Hard", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Hard", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Hard", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Easy", 5));
		questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Easy", 5));

		// Create a QuestionPaperGenerator
		QuestionPaperGenerator questionPaperGenerator = new QuestionPaperGenerator(questionStore);

		// Generate a question paper with specified difficulty distribution
		List<Question> questionPaper = questionPaperGenerator.generateQuestionPaper(100, 20, 50, 30);

		// Print the generated question paper
		System.out.println("Generated Question Paper:");
		for (Question question : questionPaper) {
			System.out.println(question.question + " - " + question.difficulty + " - " + question.marks + " marks");
		}
	}

}
