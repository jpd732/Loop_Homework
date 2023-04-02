//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class


public class Prime_Numbers
{
    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //creating method to build a function
    public void prime_no()
    {


        //Sout to ask user to input number to check it is prime or not
        System.out.println("Please input any number to check if the number is prime or not: ");

        //taking input to check the given user input number is prime number or not.
        int n = scanner.nextInt();

        int a = 0;  //This is a counter that if the input number is divisible by only 2 numbers between range 1 to user input. so that will be a prime number.

        for (int i=1; i<=n; i++) //for loop to check all the numbers between the range of 1 to user input
        {
            if (n % i == 0) // if statement to check the given number is divisible and remainder is 0 or not.
            {
                a++; //whatever number between the range of user input is divisible and remainder is 0,it will add 1 in the counter(a).
            }
        }

            if (a == 2) //If the counter is equals to 2 then it is a prime number. If more than 2 numbers are divisible to user input then it is not a prime number.
            {
                System.out.println(+n+" is a prime number.");
            }
            else
            {
                System.err.println(+n+" is not a prime number.");
            }


    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Prime_Numbers prime_numbers = new Prime_Numbers();

        //Calling non-static method with new class object.
        prime_numbers.prime_no();


    }









}
