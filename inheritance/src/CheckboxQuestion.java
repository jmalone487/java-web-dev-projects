import java.util.Arrays;
import java.util.List;

public class CheckboxQuestion extends Question {
    private String[] possibleAnswers;
    private List<Integer> correctAnswerIndexes;

    // Constructor
    public CheckboxQuestion(String questionText, String[] possibleAnswers, List<Integer> correctAnswerIndexes) {
        super(questionText);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswerIndexes = correctAnswerIndexes;
    }

    // Display the possible answers
    @Override
    public void displayAnswers() {
        for (int i = 0; i < possibleAnswers.length; i++) {
            System.out.println((i + 1) + ": " + possibleAnswers[i]);
        }
    }

    // Check if the user's answers are correct
    @Override
    public boolean isCorrect(String[] userAnswer) {
        List<Integer> userAnswersList = Arrays.stream(userAnswer)
                .map(Integer::parseInt)  // Convert string inputs to integers
                .map(i -> i - 1)         // Adjust index since display starts at 1
                .toList();

        // Compare the user selected indexes with the correct answer indexes
        return userAnswersList.containsAll(correctAnswerIndexes) &&
                correctAnswerIndexes.containsAll(userAnswersList);
    }
}
