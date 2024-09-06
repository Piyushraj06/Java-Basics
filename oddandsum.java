import java.util.Scanner;
public class oddandsum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the terms: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i =1; i<=n; i++){
            System.out.println(2*i-1);
            sum+=2*i-1;
        }
        System.out.println("The Sum of odd Natural Number upto "+ n +" terms is: " + sum);
    }
}