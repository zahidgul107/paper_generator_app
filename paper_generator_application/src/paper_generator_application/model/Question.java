package paper_generator_application.model;

public class Question {
	
	// Fields to represent a question
	public String question;
    String subject;
    String topic;
    public String difficulty;
    public int marks;

    // Constructor to initialize a question
    public Question(String question, String subject, String topic, String difficulty, int marks) {
        this.question = question;
        this.subject = subject;
        this.topic = topic;
        this.difficulty = difficulty;
        this.marks = marks;
    }

}
