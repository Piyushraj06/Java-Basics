import java.util.Scanner;
public class leapyearornot {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any year");
        year = sc.nextInt();

        boolean x = (year % 4==0);
        boolean y = (year % 100 !=0);
        boolean z =((year % 400==0) && (year % 100==0));

        if ((x)&&(y||z)){
            System.out.println(year +" " +"leap year ");
        }
        else{
            System.out.println(year +" "+ "Not a leap year");
        }
    }
}
