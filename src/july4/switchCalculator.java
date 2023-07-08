package july4;

import java.util.Scanner;

public class switchCalculator {
    public static void main(String[] args) {

        System.out.println(" Welcome to my  Switch Calculator");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulus");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input :");
        int input = sc.nextInt();
        int num1;
        int num2;

        switch(input){
            case 1:
                // Add here
                System.out.print("Enter the first number");
                num1 = sc.nextInt();

                System.out.print("Enter the second number");
                num2 = sc.nextInt();

                int sum = num1 + num2;
                System.out.println("Sum of " + num1+" and " + num2+ " is:" + sum);
                break;
            case 2:
                // Subtract here
                System.out.print("Enter the first number : ");
                num1 = sc.nextInt();

                System.out.print("Enter the second number :");
                num2 = sc.nextInt();

                int subtract = num1 - num2;
                System.out.println("Subtraction of " + num1+" and " + num2+ " is:" + subtract);
                break;
            case 3:
                // Multiplication here
                System.out.print("Enter the first number :");
                num1 = sc.nextInt();

                System.out.print("Enter the second number :");
                num2 = sc.nextInt();

                int multiplication = num1 * num2;
                System.out.println("Multiplication of " + num1+" and " + num2+ " is:" + multiplication);
                break;
            case 4:
                // Division here
                System.out.print("Enter the first number :");
                num1 = sc.nextInt();

                System.out.print("Enter the second number :");
                num2 = sc.nextInt();

                float division = num1 / num2;
                System.out.println("Division of " + num1+" and " + num2+ " is:" + division);
                break;
            case 5:
                // Modulus here
                System.out.print("Enter the first number :");
                num1 = sc.nextInt();

                System.out.print("Enter the second number :");
                num2 = sc.nextInt();

                int modulus = num1 % num2;
                System.out.println("Modulus of " + num1+" and " + num2+ " is:" + modulus);
                break;
                default :
                    System.out.println(" Your input in invalid/ Wrong input");
                    break;

        }





    }
}