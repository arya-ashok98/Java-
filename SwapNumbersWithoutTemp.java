import java.util.Scanner;

public class SwapNumbersWithoutTemp {

     public static void main(String args[]) {

        int firstNumber, secondNumber;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the first number: ");

        firstNumber = sc.nextInt();

        System.out.println("\nEnter the second number: ");

        secondNumber = sc.nextInt();

        System.out.println("\nThe value of the first number and the second number before swapping is: "+firstNumber+" and "+secondNumber);

        firstNumber = firstNumber + secondNumber; // firstNumber = 2, secondNumber = 8 so now, firstNumber = 10

        secondNumber = firstNumber - secondNumber; // -> secondNum <- (10-8 = 2)

        firstNumber = firstNumber - secondNumber;

        System.out.println("\nThe value of the first number and the second number after swapping is: "+firstNumber+" and "+secondNumber);


     }
}

        

        

        

        