import java.io.IOException;

public class Calculator {
    public static double calculate(double firstOperand, double secondOperand) throws IOException {
        if (secondOperand == 0)
            throw new RuntimeException("Invalid divisor");
        else
            return firstOperand / secondOperand;
    }
}
