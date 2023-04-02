//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class


public class Factorial_Number
{


    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //creating method to build a function
    public void factorial()
    {

        int i;
        long factor = 1;
        //Sout to ask user to input any number
        System.out.println("Please enter any number to calculate any factorial: ");

        long no = scanner.nextLong();         //Input no to calculate factorial

        for ( i = 1; i <= no; i++)   //for loop to create loop to check range between 1 to user input and to calculate factorial.
        {
            factor = factor * i; // Calculation of factorial
        }


        System.out.println("Factorial of "+no+" is: " + factor);


    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Factorial_Number factorial_number = new Factorial_Number();

        //Calling non-static method with new class object.
        factorial_number.factorial();


    }






}
