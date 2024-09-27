public class MultipleChoiceQuestion extends Question {
    private String[] possibleAnswers;
    private int correctAnswerIndex;

    public MultipleChoiceQuestion(String questionText, String[] possibleAnswers, int correctAnswerIndex) {
        super(questionText);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    @Override
    public void displayAnswers() {
        for (int i = 0; i < possibleAnswers.length; i++) {
            System.out.println((i + 1) + ": " + possibleAnswers[i]);
        }
    }

    @Override
    public boolean isCorrect(String[] userAnswer) {
        int userChoice = Integer.parseInt(userAnswer[0]);
        return userChoice == correctAnswerIndex + 1;
    }
}
