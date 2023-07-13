package july8;

import java.util.Scanner;

public class sumOfNaturalNumbers {

    public static void main(String[] args){
        int counter= 0;
        System.out.println("Addition of Natural numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of i :");
        int i = scanner.nextInt();
        while (counter<=i){
            int sum = counter++  + i ;
            System.out.println(sum);
        }


    }
}
