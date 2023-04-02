//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class


public class Calculator_Switch
{


    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //creating method to build a function
    public void calci()
    {

        char operator;      //declaring character to store operators like +,-,/
        Double no_1, no_2, answer;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // sout to ask users to enter operator
        System.out.println("Please enter an operator like : +, -, *, or /");
        operator = input.next().charAt(0);

        //Sout to ask users to enter numbers
        System.out.println("Please enter first number");
        no_1 = input.nextDouble();

        System.out.println("Please enter second number");
        no_2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers if input is +
            case '+':
                answer = no_1 + no_2;
                System.out.println(no_1 + " + " + no_2 + " = " + answer);
                break;

            // performs subtraction between numbers if input is -
            case '-':
                answer = no_1 - no_2;
                System.out.println(no_1 + " - " + no_2 + " = " + answer);
                break;

            // performs multiplication between numbers if user input is *
            case '*':
                answer = no_1 * no_2;
                System.out.println(no_1 + " * " + no_2 + " = " + answer);
                break;

            // performs division between numbers if user input is /
            case '/':
                answer = no_1 / no_2;
                System.out.println(no_1 + " / " + no_2 + " = " + answer);
                break;
            //If user input invalid character then it will print message that input is invalid.
            default:
                System.err.println("Invalid operator!");
                break;
        }








    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Calculator_Switch calculator_switch = new Calculator_Switch();

        //Calling non-static method with new class object.
        calculator_switch.calci();


    }











}
