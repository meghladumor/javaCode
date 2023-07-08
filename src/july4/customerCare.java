package july4;

import java.util.Scanner;

public class customerCare {
    public static void main(String[] args){
        System.out.println(" Welcome to Customer care service ");
        System.out.println("Press 1 for Language");
        System.out.println("Press 2 for Account");
        System.out.println("Press 3 for Balance details");
        System.out.println("Press 4 for Any other services");
        System.out.println("Press 5 for Agent");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input :");
        int input = sc.nextInt();

        switch(input){
            case 1:
                System.out.println(" Which language would you like to prefer- English or French");
                break;
            case 2:
                System.out.println(" What information you are looking for in the Account");
                break;
            case 3:
                System.out.println(" your ");
                break;

        }





    }
}
