package july4;

import java.util.Scanner;

public class firstCalculator2 {

    public static void main(String[] args) {

        System.out.println(" Welcome to my Calculator");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulus");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input :");
        char ch = sc.next().charAt(0);


        if (ch == '+') {
            // add here
            System.out.print("Enter the first number");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number");
            int num2 = sc.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum of " + num1 + " and " + num2 + " is:" + sum);


        } else if (ch == '-') {
            // Subtract here
            System.out.print("Enter the first number : ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number :");
            int num2 = sc.nextInt();

            int subtract = num1 - num2;
            System.out.println("Subtraction of " + num1 + " and " + num2 + " is:" + subtract);

        } else if (ch == '*') {
            // Multiplication here
            System.out.print("Enter the first number :");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number :");
            int num2 = sc.nextInt();

            int multiplication = num1 * num2;
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is:" + multiplication);

        } else if (ch == '/') {
            // Division here
            System.out.print("Enter the first number :");
            float num1 = sc.nextFloat();

            System.out.print("Enter the second number :");
            float num2 = sc.nextFloat();

            float division = num1 / num2;
            System.out.println("Division of " + num1 + " and " + num2 + " is:" + division);

        } else if (ch == '%') {
            // Modulus here
            System.out.print("Enter the first number :");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number :");
            int num2 = sc.nextInt();

            int modulus = num1 % num2;
            System.out.println("Modulus of " + num1 + " and " + num2 + " is:" + modulus);

        } else {
            System.out.println(" Your input in invalid/ Wrong input");

        }
    }
}
