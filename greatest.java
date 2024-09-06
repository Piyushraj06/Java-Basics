import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class greatest {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input 1st number: ");
        int num1 = sc.nextInt();

        System.out.println("input 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("input 3rd number: ");
        int num3 = sc.nextInt();

        if((num1>num2)&& (num1>num3)){
            System.out.println("The greatest number is num1 : "+ num1);
        }
        else if((num2>num1)&& (num2>num3)){
            System.out.println("The greatest number is num2 : "+ num2);
        }
        else{
            System.out.println("The greatest number is num3: "+ num3);
        }

    }
}
