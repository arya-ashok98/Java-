import java.util.Scanner;

public class SwapNumbersWithTemp {

      public static void main(String args[]) {

         int temp = 0, numberOne, numberTwo;

         Scanner sc = new Scanner(System.in);

         System.out.println("\nEnter the first number: ");

         numberOne = sc.nextInt();

	 System.out.println("\nEnter the second number: ");

         numberTwo = sc.nextInt();

         System.out.println("\nThe value of NumberOne and NumberTwo before swapping is: "+numberOne+" and "+numberTwo);

         temp = numberOne;

         numberOne = numberTwo;

         numberTwo = temp;

         System.out.println("\nThe value of NumberOne and NumberTwo after swapping is: "+numberOne+" and "+numberTwo);

      }

}

        
