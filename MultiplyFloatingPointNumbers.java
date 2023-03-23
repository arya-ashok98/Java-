// Without using any user defined functions

import java.util.Scanner;

public class MultiplyFloatingPointNumbers {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the first number: ");

        float numberOne = sc.nextFloat();

        System.out.println("\nEnter the second number: ");

        float numberTwo = sc.nextFloat();

        float result = numberOne * numberTwo;

        System.out.println("\nThe product of the numbers "+numberOne+" and "+numberTwo+" is: "+result);

    }
}
        
