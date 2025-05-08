package lambda.simpleexamples;

@FunctionalInterface
public interface NumberPairCalculation {

    int calculate(int i, int j);

    default void printResult(int i, int j, String operation, int result) {
        System.out.println("Result of " + operation + " number " + i + " and " + j + ": " + result + "\n");
    }
}
