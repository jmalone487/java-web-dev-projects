public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Adding a Multiple Choice Question
        String[] mcAnswers = {"Red", "Blue", "Green", "Yellow"};
        MultipleChoiceQuestion mcQuestion = new MultipleChoiceQuestion("What is the color of the sky?", mcAnswers, 1);
        quiz.addQuestion(mcQuestion);

        // Adding a Checkbox Question
        String[] cbAnswers = {"Apples", "Bananas", "Cherries", "Dates"};
        CheckboxQuestion cbQuestion = new CheckboxQuestion("Which fruits are red?", cbAnswers, List.of(0, 2)); // Apples and Cherries
        quiz.addQuestion(cbQuestion);

        // Adding a True/False Question
        TrueFalseQuestion tfQuestion = new TrueFalseQuestion("The Earth is flat.", false);
        quiz.addQuestion(tfQuestion);

        // Running the quiz
        quiz.runQuiz();
    }
}
