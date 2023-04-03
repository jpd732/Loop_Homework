//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class



public class Print_Month
{

    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //creating method to build a function
    public void month()
    {
        System.out.print("Please enter any month's number: ");

        int month_number = scanner.nextInt();       //scanner to take input

        switch (month_number)           // Switch statement to check which month's number user is entering and to print the month name accordingly.
        {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Print_Month print_month = new Print_Month();

        //Calling non-static method with new class object.
        print_month.month();


    }

}
