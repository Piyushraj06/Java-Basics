import java.util.Scanner;
public class pascal {
    public static void main(String[] args) {
        int c, i ,j;
        c=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n = sc.nextInt();
        for(i =0;i<=n; i++){
            for(j =0; j<=n-i; j++){
                System.out.print(" ");
            }
            for(j =0; j<=i; j++){
                if(i ==0 || j==0)
                    c =1;
                else
                    c = c*(i-j+1)/j;
                    System.out.print(" "+ c);
                }
            System.out.println(" ");
        }
    }
}
