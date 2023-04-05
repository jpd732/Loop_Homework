//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class


public class Count_A
{

    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //creating method to build a function
    public void Count()
    {
    System.out.println("Please enter any string to count total number of a: ");

    String sentence = scanner.nextLine();  //Taking string input from user
        int count = 0;

        for (int i = 0; i < sentence.length(); ++i) //for loop to create a loop to scan and count how many times a has been printed.
        {
            if (sentence.charAt(i) == 'a')  //Using if condition and charAt method to scan the input string and checking how many times 'a' has been entered in that string.
            {
                count++;  //This will keep count how many times 'a' has been printed.
            }
        }

        System.out.println("Number of times 'a' printed in your given string is: " + count);

        if (count == 0)
        {
            System.err.println("Please make sure you use 'a' at least once in your input string");
        }
    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Count_A count_a = new Count_A();

        //Calling non-static method with new class object.
        count_a.Count();


    }




}
