package paper_generator_application.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionPaperGenerator {
	
	private QuestionStore questionStore;

    public QuestionPaperGenerator(QuestionStore questionStore) {
        this.questionStore = questionStore;
    }

    public List<Question> generateQuestionPaper(int totalMarks, double easyPercentage, double mediumPercentage, double hardPercentage) {
        List<Question> questionPaper = new ArrayList<>();
        List<Question> easyQuestions = filterQuestionsByDifficulty("Easy");
        List<Question> mediumQuestions = filterQuestionsByDifficulty("Medium");
        List<Question> hardQuestions = filterQuestionsByDifficulty("Hard");

        int easyMarks = (int) (totalMarks * easyPercentage / 100);
        int mediumMarks = (int) (totalMarks * mediumPercentage / 100);
        int hardMarks = totalMarks - easyMarks - mediumMarks;

        questionPaper.addAll(selectRandomQuestions(easyQuestions, easyMarks));
        questionPaper.addAll(selectRandomQuestions(mediumQuestions, mediumMarks));
        questionPaper.addAll(selectRandomQuestions(hardQuestions, hardMarks));

        return questionPaper;
    }

    private List<Question> filterQuestionsByDifficulty(String difficulty) {
        List<Question> filteredQuestions = new ArrayList<>();
        for (Question question : questionStore.getQuestions()) {
            if (question.difficulty.equals(difficulty)) {
                filteredQuestions.add(question);
            }
        }
        return filteredQuestions;
    }

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
