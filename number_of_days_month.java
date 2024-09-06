import java.util.Scanner;
public class number_of_days_month{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number_of_days_month=0;
        String MonthOfName = "unknown";

        System.out.println("Enter a month name =");
        int month = sc.nextInt();
        System.out.println("Enter year name =");
        int year = sc.nextInt();
        switch(month){
            case 1:
            MonthOfName = "January";
            number_of_days_month= 31;
            break;

            case 2:
            MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_of_days_month = 29;
                } else {
                    number_of_days_month = 28;
                }
                break;
            case 3:
            MonthOfName = "March";
            number_of_days_month= 31;
            break;

            case 4:
            MonthOfName = "April";
            number_of_days_month= 30;
            break;

            case 5:
            MonthOfName = "May";
            number_of_days_month= 31;
            break;

            case 6:
            MonthOfName = "June";
            number_of_days_month= 30;
            break;

            case 7:
            MonthOfName = "July";
            number_of_days_month= 31;
            break;

            case 8:
            MonthOfName = "August";
            number_of_days_month= 31;
            break;

            case 9:
            MonthOfName = "September";
            number_of_days_month= 30;
            break;

            case 10:
            MonthOfName = "October";
            number_of_days_month= 31;
            break;

            case 11:
            MonthOfName = "November";
            number_of_days_month= 30;
            break;

            case 12:
            MonthOfName = "December";
            number_of_days_month= 31;
            break;
        }
        System.out.println(MonthOfName + ' ' + year + " " + "has" + " " + number_of_days_month + " " + "days" );
    }
}