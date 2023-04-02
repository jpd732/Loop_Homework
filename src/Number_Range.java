//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class


public class Number_Range
{


    //Creating a method in order to build a mechanism to take user input and print 10 numbers between the given user input range.
    public void Print_10numbers()
        {
            //Calling scanner method to take input from user and using system.in to ake user input.
            Scanner scanner = new Scanner(System.in);

            //creating variable to start from user input number.
            int n1;
            int n2;


            //Using scanner and Sout to ask user to give range input and to take those input.
        System.out.println("Please enter your range in order to print 10 numbers between those range. for example 10 to 20:");
        System.out.println("Please enter number 1: ");
            n1 = scanner.nextInt();

            System.out.println("Please enter number 2: ");
            n2 = scanner.nextInt();

            System.out.println("Ten numbers between your given input range are:");
            for (int i = n1; i <= n2; i++ )
        {
            System.out.println(i);
        }


        }


        //Main method to execute the program.
    public static void main(String[] args)
        {
            //calling class object to call non-static method to execute that function.
            Number_Range number_range = new Number_Range();

            //Calling non-static method with new class object.
            number_range.Print_10numbers();

        }

}
