import java.util.Scanner;
public class Pos_neg{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("input number");
        int input = in.nextInt();
        if (input > 0){
            System.out.println("Number is positive");
        }
        else if(input<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("number is zero");
        }
    }    
}