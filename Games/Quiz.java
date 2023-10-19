import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Java Quiz!");

        // Initialize questions and answers
        String[] questions = {
                "What is the capital of France?",
                "Which programming language is this program written in?",
                "What is the result of 2 + 2?"
        };

        String[] options = {
                "A. Paris\nB. Madrid\nC. Berlin",
                "A. Java\nB. Python\nC. C++",
                "A. 3\nB. 4\nC. 5"
        };

        char[] correctAnswers = {'A', 'A', 'B'};

        // Initialize score
        int score = 0;

        // Ask questions and check answers
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.println(options[i]);
            System.out.print("Your answer (A/B/C): ");

            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + ".");
            }
        }

        // Display final score
        System.out.println("\nQuiz completed! Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
