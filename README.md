# Java Calculator Project

## Overview
This project is a command-line calculator application written in Java. It provides a wide range of mathematical operations such as addition, subtraction, multiplication, division, square, cube, square root, cube root, exponential, logarithm, trigonometric functions (sin, cos, tan), inverse trigonometric functions (arcsin, arccos, arctan), and factorial.

## Features
- **Basic Arithmetic Operations:** Addition, Subtraction, Multiplication, Division.
- **Power Operations:** Square, Cube, Exponential.
- **Root Operations:** Square Root, Cube Root.
- **Logarithmic Operations:** Logarithm (base 10).
- **Trigonometric Functions:** Sin, Cos, Tan.
- **Inverse Trigonometric Functions:** Arcsin, Arccos, Arctan.
- **Factorial Calculation.**

## Requirements
- Java Development Kit (JDK) 8 or higher.
- A command-line interface (CLI) to run the application.

## How to Run
1. Ensure you have JDK installed on your machine.
2. Copy the code into a file named `Main.java`.
3. Open a command-line interface and navigate to the directory containing `Main.java`.
4. Compile the Java program using the command:
    ```bash
    javac Main.java
    ```
5. Run the compiled Java program using the command:
    ```bash
    java mini_project.Main
    ```

## Usage
1. Upon running the application, a menu with various mathematical operations will be displayed.
2. Enter the number corresponding to the desired operation.
3. Follow the prompts to enter the required inputs.
4. The result will be displayed on the screen.
5. To exit the application, enter `18`.

## Code Structure
The project contains two main classes:
- `Calculator`: This class contains static methods for performing various mathematical operations.
- `Main`: This class contains the main method which provides the user interface and calls the appropriate methods from the `Calculator` class based on user input.

### Calculator Class
- **Addition:** `public static double add()`
- **Subtraction:** `public static double subtract()`
- **Multiplication:** `public static double multiply()`
- **Division:** `public static double divide()`
- **Square:** `public static double square()`
- **Cube:** `public static double cube()`
- **Square Root:** `public static double squareRoot()`
- **Cube Root:** `public static double cubeRoot()`
- **Exponential:** `public static double exponential()`
- **Logarithm:** `public static double logarithm()`
- **Sin:** `public static double sin()`
- **Cos:** `public static double cos()`
- **Tan:** `public static double tan()`
- **Inverse Sin:** `public static double inverseSin()`
- **Inverse Cos:** `public static double inverseCos()`
- **Inverse Tan:** `public static double inverseTan()`
- **Factorial:** `public static double factorial()`

### Main Class
- The `Main` class contains the `main` method which runs the application.
- It displays a menu to the user, takes user input, and calls the corresponding methods from the `Calculator` class.
- It continues to run until the user chooses to exit by entering `18`.

## Example
```plaintext
Calculator Menu:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Square
6. Cube
7. Square Root
8. Cube Root
9. Exponential
10. Logarithm
11. Sin
12. Cos
13. Tan
14. Inverse Sin
15. Inverse Cos
16. Inverse Tan
17. Factorial
18. Exit
Enter your choice: 1
Enter the first number: 5
Enter the second number: 3
Result: 8.0
--------------------------------------------------------------------------------------
