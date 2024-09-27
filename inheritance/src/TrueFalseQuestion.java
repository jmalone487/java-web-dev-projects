public class TrueFalseQuestion extends Question {
    private boolean correctAnswer;

    // Constructor
    public TrueFalseQuestion(String questionText, boolean correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer;
    }

    // Display the true/false options
    @Override
    public void displayAnswers() {
        System.out.println("1: True");
        System.out.println("2: False");
    }

    // Check if the user's answer is correct
    @Override
    public boolean isCorrect(String[] userAnswer) {
        // Convert user answer to a boolean
        int userChoice = Integer.parseInt(userAnswer[0]);
        boolean userBooleanAnswer = (userChoice == 1);  // 1 for true, 2 for false

        return userBooleanAnswer == correctAnswer;
    }
}
