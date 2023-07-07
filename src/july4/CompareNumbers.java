package july4;

public class CompareNumbers {
    public static void main(String[] args){

        int x = 12, y= 50, z =16;

        if (x>=y && x>=z){
            System.out.println(" X is the largest number");
        }else if ( y>=x && y >=z){
            System.out.println(" Y is the largest number ");
        }else if (z>=x && z>=y){
            System.out.println("Z is the largest number");
        }
    }
}
