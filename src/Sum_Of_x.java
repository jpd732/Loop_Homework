
//Creating a new java class

public class Sum_Of_x
{
    //creating method to build a function
    public void sum_x()
    {
        long x = 0;           //Declaring long variable to store sum of range 1 to 20.

        for(int i = 1; i <= 20; ++i)   //For loop to create loop and count and add the numbers between range from 1 to 20.
        {
            x += i;       //adding numbers of the given range
        }

        System.out.println("Sum of x ranging from 1 to 20 is = " + x);
    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Sum_Of_x sum_of_x = new Sum_Of_x();

        //Calling non-static method with new class object.
        sum_of_x.sum_x();
    }







}
