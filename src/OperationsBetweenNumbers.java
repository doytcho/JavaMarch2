import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();

        double sum = 0;
        String result = "";
        switch (operator) {
            case "+":
                sum = number1 + number2;
                result = "";
                if (sum % 2 == 0) {
                    result = "even";
                } else {
                    result = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", number1, operator, number2, sum, result);
                break;
            case "-":
                sum = number1 - number2;
                result = "";
                if (sum % 2 == 0) {
                    result = "even";
                } else {
                    result = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", number1, operator, number2, sum, result);
                break;
            case "*":
                sum = number1 * number2;
                result = "";
                if (sum % 2 == 0) {
                    result = "even";
                } else {
                    result = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", number1, operator, number2, sum, result);
                break;
            case "/":
                if (number2 != 0) {
                    sum = 1.0*number1 / number2;
                    result = "";
                    System.out.printf("%d %s %d = %.2f", number1, operator, number2, sum);
                }else {
                    System.out.printf("Cannot divide %d by zero",number1);
                }
                break;
            case "%":
                if (number2 != 0) {
                    sum = number1 % number2;
                    result = "";
                    System.out.printf("%d %s %d = %.0f", number1, operator, number2, sum);
                }else {
                    System.out.printf("Cannot divide %d by zero",number1);
                }
                break;
        }


    }
}
