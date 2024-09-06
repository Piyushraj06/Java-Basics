import java.util.Scanner;
public class floating {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter floating number ");
        double x = sc.nextDouble();

        System.out.println("Enter another floating number ");
        double y = sc.nextDouble();

        x = Math.round(x*1000); 
        x = x/1000;            

        y = Math.round(y*1000);
        y = y/1000;

        if(x==y){
            System.out.println("The floting number ars equal ");
        }
        else{
            System.out.println("They are different");
        }
    }
    
}
