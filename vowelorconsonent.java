import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class vowelorconsonent {
    public static void main(String []args){
        char input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an alphabet");
        input = sc.next().charAt(0);

        if(input == 'a'|| input == 'e'|| input == 'i'|| input == 'o'|| input == 'u'|| input == 'A'|| input == 'E'|| input == 'I'|| input == 'O'|| input == 'U')
        {
            System.out.println("vowels");
        }
        else
        {
            System.out.println("consonent");
        }
    }
    
}
