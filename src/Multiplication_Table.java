//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class


public class Multiplication_Table
{
    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //creating method to build a function
    public void table()
    {
        System.out.println("Please enter any number to print it's table: ");
        int no = scanner.nextInt();  //scanner to take input from user to print table of that number.

        for(int i = 1; i <= 10; i++)        //for loop to set range 1 to 10 to print table multiplying between this range.
        {
            System.out.printf("\n" + no + "*" + i + "=" + no * i);  //printing table of the user input.
        }
    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Multiplication_Table multiplication_table = new Multiplication_Table();

        //Calling non-static method with new class object.
        multiplication_table.table();


    }
}
