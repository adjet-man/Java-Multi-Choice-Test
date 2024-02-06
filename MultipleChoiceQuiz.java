import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MultipleChoiceQuiz {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int score = 0;


            // Questions defined with answers 
            ArrayList<Question> questions = new ArrayList<>();
            questions.add(new Question("What is the capital city of Ghana?", "A) Paris", "B) London", "C) Accra", "D) Lome", "C"));
            questions.add(new Question("Which planet is known as the Red Planet?", "A) Venus", "B) Mars", "C) Jupiter", "D) Saturn", "B"));
            questions.add(new Question("What is the largest mammal on Earth?", "A) Elephant", "B) Giraffe", "C) Blue Whale", "D) Dolphin", "C"));
            questions.add(new Question("What was the first president of Ghana", "A) Kwame Nkrumah", "B) George Otto", "C) Akuffo Addo", "D) John Mahama", "A"));
            questions.add(new Question("Which river is the longest in Ghana and flows through its capital city?", "A) Nile", "B) Niger", "C) Volta", "D) Zambezi", "C"));
            questions.add(new Question("What is the famous festival in Ghana called the harvest season and its known for its colorful celebrations?", "A) Easter", "B) Christmas", "C) Homowo", "D) Fata", "C"));
            questions.add(new Question("What is the official language of Ghana?", "A) Twi", "B) Hausa", "C) English", "D) Akan", "C"));

            //Questions shuffled randomly 
            Collections.shuffle(questions);

            System.out.println("Welcome to the Multiple Choice Quiz!");

            for (int i = 0; i < questions.size(); i++) {
                Question currentQuestion = questions.get(i);
                System.out.println("\nQuestion " + (i + 1) + ": " + currentQuestion.getQuestion());

                for (int j = 0; j < currentQuestion.getChoices().length - 1; j++) {
                    System.out.println(currentQuestion.getChoices()[j]);
                }

                System.out.print("Your answer (enter A, B, C, or D): ");
                String userAnswer = scanner.nextLine().toUpperCase();

                //Check if answers are correct 
                if (userAnswer.equals(currentQuestion.getCorrectAnswer())) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is " + currentQuestion.getCorrectAnswer() + "\n");
                }
            }

            System.out.println("Quiz completed! Your score: " + score + "/" + questions.size());
        }
    }
}

class Question {
    private String question;
    private String[] choices;
    private String correctAnswer;

    public Question(String question, String... choices) {
        this.question = question;
        this.choices = choices;
        this.correctAnswer = choices[choices.length - 1].substring(0, 1); // Extraction of the correct answer from the last choice
    }

    public String getQuestion() {
        return question;
    }

    public String[] getChoices() {
        return choices;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
