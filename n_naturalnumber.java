import java.util.Scanner;
public class n_naturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
       int n = sc.nextInt();
       int sum =0;

       for(int i = 1; i<=n; i++){
           System.out.println(i);
           sum = sum+i;
       }
       System.out.println("the sum are  " + " "+ sum);
    }
    
}
