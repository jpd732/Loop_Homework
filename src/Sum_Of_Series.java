//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class

public class Sum_Of_Series
{
    Scanner scanner = new Scanner(System.in);

    //creating method to build a function
    public void Series()
    {
        double sum = 0.0;       //declaring variable sum.

        System.out.println("Please enter value of n: ");        //Asking user to input value of n.
        int n = scanner.nextInt();       //Scanner to take input


        for (int i = 1; i <= n; i++)        //Using for loop to iterate over numbers till user input.
        {
            sum += 1.0 / i;         //Calculation of given series of equation in question.
        }

        System.out.println("The calculation of sum of the given series is: " + sum);

    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Sum_Of_Series sum_of_series = new Sum_Of_Series();

        //Calling non-static method with new class object.
        sum_of_series.Series();


    }
}
