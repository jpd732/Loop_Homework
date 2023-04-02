//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class



public class Natural_Number
{



    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //creating method to build a function
    public void Natural_No()
    {

        System.out.println("Please enter number to get sum of the natural numbers: ");
        long n = scanner.nextLong();   // Taking input from user to get sum
        long sum = 0;           //Declaring variable sum and initializing it with 0. created to store the value of sum.

        for(int i = 1; i <= n; ++i)   //For loop to create loop and count and add the numbers between range from 1 to user input.
        {
            sum += i;       //similar to sum = sum + i.
        }

        System.out.println("Sum of Natural numbers = " + sum);


    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Natural_Number natural_number = new Natural_Number();

        //Calling non-static method with new class object.
        natural_number.Natural_No();


    }










}
