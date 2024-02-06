# Introduction
This MultipleChoiceQuiz program is a console-based application designed to administer a quiz with multiple-choice questions. It provides an interactive experience where users are presented with a series of questions and must select the correct answer from the given options. The program is implemented in Java, showcasing object-oriented programming principles.

# Features
- Dynamic Question Bank: Questions are stored in an ArrayList, allowing for easy addition or removal of questions.
- Randomized Questions: The order of questions is randomized for each run, ensuring a unique quiz experience every time.
- Immediate Feedback: After each question, the user is informed whether their answer was correct or incorrect, and the correct answer is displayed.
- Score Tracking: The program tracks the number of correct answers and displays the user's score at the end of the quiz.
# Components
- MultipleChoiceQuiz class: This is the main class that runs the quiz. It initializes the question bank, shuffles the questions, handles user input, and displays the score.

- Question class: Represents a single quiz question. It stores the question text, the multiple-choice options, and the correct answer. This class provides methods to access these properties.

# How It Works
- Initialization: Upon starting, the program initializes a list of Question objects, each representing a different quiz question with multiple-choice answers.

- Shuffling: The list of questions is shuffled to randomize the order in which they are presented to the user.

- Quiz Execution: The program enters a loop, presenting each question and its options to the user. The user inputs their answer, and the program evaluates it, providing immediate feedback.

- Scoring: The program keeps track of the number of correct answers. After all questions have been answered, it displays the user's total score.

- User Interaction: Interaction with the user is done through the console using a Scanner object for input. The user selects answers by entering the corresponding option (A, B, C, or D).

# Usage
To use the MultipleChoiceQuiz, simply compile and run the MultipleChoiceQuiz.java file. Follow the on-screen instructions to answer the questions. After the last question, your score will be displayed.

# Conclusion
The MultipleChoiceQuiz program is an example of how Java can be used to create simple, interactive applications. It demonstrates fundamental programming concepts such as object-oriented design, collections manipulation, user input handling, and control flow management.