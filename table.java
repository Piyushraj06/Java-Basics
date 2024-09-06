import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =0;
        int j =0;
        System.out.println("input number of terms : ");
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        for (i = 0; i<10; i++){
            System.out.print(n + " " + "X" + " " + (i+1) + " " + " = " + (n*(i+1)) );  
        }
        for(j =0; j<10; j++){
            System.out.print(n1 + " " + "X" + " " + (j+1) + " " + " = " + (n1*(j+1)) );
        }
    }
    
}
