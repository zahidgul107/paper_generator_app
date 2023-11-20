package paper_generator_application.model;

public class Question {
	
	public String question;
    String subject;
    String topic;
    public String difficulty;
    public int marks;

    public Question(String question, String subject, String topic, String difficulty, int marks) {
        this.question = question;
        this.subject = subject;
        this.topic = topic;
        this.difficulty = difficulty;
        this.marks = marks;
    }

}
