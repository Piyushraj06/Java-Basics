import java.util.Scanner;
public class pyramidpattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter row values: ");
        int n= sc.nextInt();

        for (int i = 1; i<=n; i++)
        {
            for (int j =n; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int k =1; k<=i; k++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}