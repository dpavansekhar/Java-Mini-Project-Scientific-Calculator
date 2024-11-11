package mini_project;

import java.util.Scanner;

class Calculator {

    public static double add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    public static double subtract() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    public static double multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    public static double divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the denominator (non-zero): ");
        double num2;
        do {
            num2 = scanner.nextDouble();
            if (num2 == 0) {
                System.out.println("Error: Denominator cannot be zero. Please enter a non-zero value.");
            }
        } while (num2 == 0);

        return num1 / num2;
    }

    public static double square() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to square: ");
        double num1 = scanner.nextDouble();
        return num1 * num1;
    }

    public static double cube() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to cube: ");
        double num1 = scanner.nextDouble();
        return num1 * num1 * num1;
    }

    public static double squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for square root: ");
        double num1 = scanner.nextDouble();
        return Math.sqrt(num1);
    }

    public static double cubeRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for cube root: ");
        double num1 = scanner.nextDouble();
        return Math.cbrt(num1);
    }

    public static double exponential() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double num2 = scanner.nextDouble();
        return Math.pow(num1, num2);
    }

    public static double logarithm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for logarithm (base 10): ");
        double num = scanner.nextDouble();
        return Math.log10(num);
    }

    public static double sin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle in radians for sin: ");
        double angle = scanner.nextDouble();
        return Math.sin(angle);
    }

    public static double cos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle in radians for cos: ");
        double angle = scanner.nextDouble();
        return Math.cos(angle);
    }

    public static double tan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle in radians for tan: ");
        double angle = scanner.nextDouble();
        return Math.tan(angle);
    }

    public static double inverseSin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for arcsin (in radians): ");
        double value = scanner.nextDouble();
        return Math.asin(value);
    }

    public static double inverseCos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for arccos (in radians): ");
        double value = scanner.nextDouble();
        return Math.acos(value);
    }

    public static double inverseTan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for arctan (in radians): ");
        double value = scanner.nextDouble();
        return Math.atan(value);
    }

    public static double factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for factorial: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
            return Double.NaN; 
        }
        double result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        while (true) {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Cube Root");
            System.out.println("9. Exponential");
            System.out.println("10. Logarithm");
            System.out.println("11. Sin");
            System.out.println("12. Cos");
            System.out.println("13. Tan");
            System.out.println("14. Inverse Sin");
            System.out.println("15. Inverse Cos");
            System.out.println("16. Inverse Tan");
            System.out.println("17. Factorial");
            System.out.println("18. Exit");

            System.out.print("Enter your choice: ");
            int choice = scr.nextInt();

            if (choice == 18) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double result = 0.0;

            switch (choice) {
                case 1:
                    result = Calculator.add();
                    break;
                case 2:
                    result = Calculator.subtract();
                    break;
                case 3:
                    result = Calculator.multiply();
                    break;
                case 4:
                    result = Calculator.divide();
                    break;
                case 5:
                    result = Calculator.square();
                    break;
                case 6:
                    result = Calculator.cube();
                    break;
                case 7:
                    result = Calculator.squareRoot();
                    break;
                case 8:
                    result = Calculator.cubeRoot();
                    break;
                case 9:
                    result = Calculator.exponential();
                    break;
                case 10:
                    result = Calculator.logarithm();
                    break;
                case 11:
                    result = Calculator.sin();
                    break;
                case 12:
                    result = Calculator.cos();
                    break;
                case 13:
                    result = Calculator.tan();
                    break;
                case 14:
                    result = Calculator.inverseSin();
                    break;
                case 15:
                    result = Calculator.inverseCos();
                    break;
                case 16:
                    result = Calculator.inverseTan();
                    break;
                case 17:
                    result = Calculator.factorial();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 18.");
                    break;
            }

            System.out.println("Result: " + result);
            System.out.println("--------------------------------------------------------------------------------------");
        }

        scr.close();
    }

}

