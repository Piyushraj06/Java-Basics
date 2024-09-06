import java.util.Scanner;
public class diamondpattern2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n = sc.nextInt();
        //Upper bound
        for(int i =1; i<=n; i++){
            //spaces
            for(int j =1; j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1; j<=2*i-1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        // Lowerbound
        for(int i=n; i>=1; i--){
            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1; j<=2*i-1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

