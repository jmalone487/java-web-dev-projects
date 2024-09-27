import java.util.ArrayList;
import java.util.List;

public class Quiz {

    // List to hold all the questions
    private List<Question> questions;

    // Constructor
    public Quiz() {
        this.questions = new ArrayList<>();
    }

    // Method to add questions to the quiz
    public void addQuestion(Question question) {
        questions.add(question);
    }

    // Method to run the quiz
    public void runQuiz() {
        int score = 0;
        for (Question question : questions) {
            question.displayQuestion();
            question.displayAnswers();

            // For simplicity, assuming the user's answers are hardcoded for now
            // In a real scenario, you'd gather input from the user
            String[] userAnswer = {}; // Replace with actual user input logic

            if (question.isCorrect(userAnswer)) {
                score++;
            }
        }
        System.out.println("You got " + score + " out of " + questions.size() + " correct!");
    }
}
