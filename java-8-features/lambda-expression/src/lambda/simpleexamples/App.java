package lambda.simpleexamples;

public class App {

    public static void main(String[] args) {

        // Lambda expression for Addition
        NumberPairCalculation addition = (a, b) -> a + b;
        int additionResult = addition.calculate(10, 5);
        addition.printResult(10, 5, "Addition", additionResult); // default method

        // Lambda expression for Subtraction
        NumberPairCalculation subtraction = (a, b) -> a - b;
        int subtractionResult = subtraction.calculate(10, 5);
        addition.printResult(10, 5, "Subtraction", subtractionResult); // default method

        // Lambda expression for Multiplication
        NumberPairCalculation multiplication = (a, b) -> a * b;
        int multiplicationResult = multiplication.calculate(10, 5);
        addition.printResult(10, 5, "Multiplication", multiplicationResult); // default method
    }
}
