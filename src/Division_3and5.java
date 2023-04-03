//Creating class
public class Division_3and5
{
    //creating method to build a function
    public void divisible()
    {
        System.out.println("Numbers between 1 to 100 which can be divided by 3: ");
        for (int i = 1; i <= 100; i++)  //for statement to set range of numbers between 1 to 100.
        {
            if (i % 3 == 0)     //if statement to check number is divisible by 3 or not.
                System.out.print(i +", ");
        }

        System.out.println("\n\nNumbers between 1 to 100 which can be divided by 5: ");
        for (int i = 1; i <= 100; i++)  //for statement to set range of numbers between 1 to 100.
        {
            if (i % 5 == 0) System.out.print(i +", ");   //if statement to check number is divisible by 5 or not.
        }
    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Division_3and5 division_3and5 = new Division_3and5();

        //Calling non-static method with new class object.
        division_3and5.divisible();


    }
}
