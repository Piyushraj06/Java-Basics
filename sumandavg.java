import java.util.Scanner;
public class sumandavg {
  public static void main(String[] args)
{       
    int i,n=0,s=0;
	double avg;
	{
        System.out.println("Input the 5 numbers : ");  
	}
		for (i=0;i<5;i++) // yaha i<5 ka matlab 5 koi bhi number agar i<10 rhega toh koi bhi 10 number
                         // (5 number jaise 1 2 3 4 5) , (10 number jaise 1 2 3 4 5 6 7 8 9 10)
		{
		    Scanner in = new Scanner(System.in);
		    n = in.nextInt();// iska matlb value 5 10 jo bhi ho
  		s +=n;
	}
	 avg=s/5;
	System.out.println("The sum of 5 no is : "+ s +"\nThe Average is : "+ avg );
}
}
