//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class



public class nLimit_Natural_Numbers
{
    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //creating method to build a function
    public void n_limit()
    {

        int n, sum=0;

            Scanner in = new Scanner(System.in);
            System.out.print("Please input any natural number: ");
            n = in.nextInt();

        System.out.println("The n natural numbers of range upto " + n + " are : ");

        for(int i = 1; i <= n; i++)  //for loop to count range between 1 to user input.
        {
            System.out.println(i);
            sum += i;  //Similar to sum = sum + i. Used to calculate sum of all the natural number upto user input range.
        }

        System.out.println("The Sum of Natural Number upto range "+n+ " are  : " +sum);

    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        nLimit_Natural_Numbers nLimit_natural_numbers = new nLimit_Natural_Numbers();

        //Calling non-static method with new class object.
        nLimit_natural_numbers.n_limit();


    }



}
