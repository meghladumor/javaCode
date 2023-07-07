package july4;

public class Test {
    public static void main(String[] args){
        int x = 2;
        float y = 4f ;
        float z = 2020f;

        if (x<0){
            System.out.println("X is a negative number");

        }else{
            System.out.println("X is a positive number");
        }

        if (y%2==0){
            System.out.println("Y is a Even number");
        }else {
            System.out.println(" Y is a Odd number");
        }
        if (z%4==0){
            System.out.println("Z is a leap year");
        }else{
            System.out.println("Z is not a leap year");
        }

    }
}
