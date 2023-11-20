package paper_generator_application.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionPaperGenerator {
	
	// Reference to the QuestionStore
	private QuestionStore questionStore;

	// Constructor to set the QuestionStore
    public QuestionPaperGenerator(QuestionStore questionStore) {
        this.questionStore = questionStore;
    }

    // Method to generate a question paper based on specified criteria
    public List<Question> generateQuestionPaper(int totalMarks, double easyPercentage, double mediumPercentage, double hardPercentage) {
        List<Question> questionPaper = new ArrayList<>();
        
        // Filter questions based on difficulty
        List<Question> easyQuestions = filterQuestionsByDifficulty("Easy");
        List<Question> mediumQuestions = filterQuestionsByDifficulty("Medium");
        List<Question> hardQuestions = filterQuestionsByDifficulty("Hard");

        // Calculate marks for each difficulty
        int easyMarks = (int) (totalMarks * easyPercentage / 100);
        int mediumMarks = (int) (totalMarks * mediumPercentage / 100);
        int hardMarks = totalMarks - easyMarks - mediumMarks;

        // Select random questions for each difficulty and add to the question paper
        questionPaper.addAll(selectRandomQuestions(easyQuestions, easyMarks));
        questionPaper.addAll(selectRandomQuestions(mediumQuestions, mediumMarks));
        questionPaper.addAll(selectRandomQuestions(hardQuestions, hardMarks));

        return questionPaper;
    }

    // Helper method to filter questions by difficulty
    private List<Question> filterQuestionsByDifficulty(String difficulty) {
        List<Question> filteredQuestions = new ArrayList<>();
        for (Question question : questionStore.getQuestions()) {
            if (question.difficulty.equals(difficulty)) {
                filteredQuestions.add(question);
            }
        }
        return filteredQuestions;
    }

    // Helper method to select random questions based on marks
    private List<Question> selectRandomQuestions(List<Question> questions, int marks) {
        Collections.shuffle(questions);
        List<Question> selectedQuestions = new ArrayList<>();
        int totalMarks = 0;
        for (Question question : questions) {
            if (totalMarks + question.marks <= marks) {
                selectedQuestions.add(question);
                totalMarks += question.marks;
            }
        }
        return selectedQuestions;
    }

}
