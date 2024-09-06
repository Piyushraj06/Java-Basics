import java.util.Scanner;
public class cube {
    public static void main(String[] args) {
        
        int i , n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms ");
        n=sc.nextInt();

        for(i=1; i<=n; i++){
            System.out.println("Number is :"+ i + " " + "and cube of "+ (i*i*i));
        }

    }
}
