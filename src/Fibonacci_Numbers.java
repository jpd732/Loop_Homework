//importing builtin Scanner
import java.util.Scanner;


//Creating a new java class

public class Fibonacci_Numbers
{
    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //Creating method to create function to print fibonacci numbers.
    public void fibonacci_sequence() {
        int n = 25;
        int previous_Number = 0;
        int add_Number = 1;

        System.out.print("Fibonacci Series of " + n + " numbers:");

        //For loop to generate fibonacci sequence
        for (int i = 1; i <= n; ++i) {
            System.out.print(previous_Number + " ");

            //Doing addition and storing the added value in the current value.
            int sum = previous_Number + add_Number;
            previous_Number = add_Number;
            add_Number = sum;
        }
    }


    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Fibonacci_Numbers fibonacci_numbers = new Fibonacci_Numbers();

        //Calling method using class object in order to execute the program of leap year.
        fibonacci_numbers.fibonacci_sequence();


    }


}
