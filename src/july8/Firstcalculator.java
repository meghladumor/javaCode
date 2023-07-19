package july8;

import java.util.Scanner;
public class Firstcalculator {

    public static void main(String[] args){

        System.out.println("Welcome to the Calculator");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulus");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input: ");

        int input = sc.nextInt();

        if ( input == 1 ){
            // Addition here
            System.out.println(" Enter the First Number :");
            int num1 = sc.nextInt();
            System.out.println(" Enter the Second Number :");
            int num2 = sc.nextInt();

            int sum = num1 + num2 ;
            System.out.println(" You additiomn will be equal to :" + sum);


        }else if ( input == 2){
            // Subtraction here
            System.out.println(" Enter the First number :");
            int num1 = sc.nextInt();
            System.out.println(" Enter the Second Number :");
            int num2 = sc.nextInt();

            int subtract = num1 -num2;
            System.out.println(" Your subtraction will be :  "+ subtract);

        }else if (input == 3){
            // Multiplication here
            System.out.print("Enter the first number :");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number :");
            int num2 = sc.nextInt();

            int multiplication = num1 * num2;
            System.out.println("Multiplication of " + num1+" and " + num2+ " is:" + multiplication);

        }else if (input==4){
            // Division here
            System.out.print("Enter the first number :");
            float num1 = sc.nextFloat();

            System.out.print("Enter the second number :");
            float num2 = sc.nextFloat();

            float division = num1 / num2;
            System.out.println("Division of " + num1+" and " + num2+ " is:" + division);

        }else if (input == 5){
            // Modulus here
            System.out.print("Enter the first number :");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number :");
            int num2 = sc.nextInt();

            int modulus = num1 % num2;
            System.out.println("Modulus of " + num1+" and " + num2+ " is:" + modulus);

        }else {
            System.out.println(" Your input in invalid/ Wrong input");

        }









    }
}
