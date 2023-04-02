//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class

public class Reverse_Number
{




    //creating method to build a function that reverse the number
    public void reverse()
    {
        //Calling Scanner method to take input from user.
        Scanner scanner = new Scanner(System.in);

            //Sout to take input from user
        System.out.println("Please enter numbers to reverse. For eg:- 1234: ");
        int no = scanner.nextInt();
        int a = 0;

        for( ;no != 0; no = no/10)
        {
            int remainder = no % 10;
            a = a * 10 + remainder;
        }
        System.out.println("The reverse number of your input is: " + a);


    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Reverse_Number reverse_number = new Reverse_Number();

        //Calling method using class object in order to execute the program of leap year.
        reverse_number.reverse();


    }



}
