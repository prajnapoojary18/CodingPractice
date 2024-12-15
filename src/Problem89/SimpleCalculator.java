package Problem89;

public class SimpleCalculator {
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 5.2;
        char operation = '+';

        double result = performCalculation(num1, num2, operation);

        if (Double.isNaN(result)) {
            System.out.println("Error! Invalid operation or division by zero.");
        } else {
            System.out.println("The result of the operation is: " + result);
        }
    }

    public static double performCalculation(double num1, double num2, char operation) {
        double result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    return Double.NaN;
                }
                break;
            default:
                return Double.NaN;
        }

        return result;
    }
}
