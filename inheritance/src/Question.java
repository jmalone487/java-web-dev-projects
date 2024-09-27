public abstract class Question {
    private String questionText;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    // Method to display the question
    public void displayQuestion() {
        System.out.println(questionText);
    }

    // Abstract method to display answers
    public abstract void displayAnswers();

    // Abstract method to check if the answer is correct
    public abstract boolean isCorrect(String[] userAnswer);
}
