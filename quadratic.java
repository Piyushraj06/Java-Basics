import java.util.*;

public class quadratic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = input.nextDouble();

        System.out.print("Input b: ");
        double b = input.nextDouble();

        System.out.print("Input c: ");
        double c = input.nextDouble();

        double result = (b*b) - 4 * a * c;

        if (result > 0.0){
            double r1 = ((-b + Math.sqrt(result))/(2*a));
            double r2 = ((-b - Math.sqrt(result))/(2*a));
            System.out.printf("The roots are "+r1+" and "+r2);
        } else if (result == 0.0){
            double r = (-b / (2*a));
            System.out.println("The roots is "+r);
        } else {
            System.out.println("The equation has no real roots.");
        }

    }
}

