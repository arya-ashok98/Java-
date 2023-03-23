// Using a user-defined function

import java.util.Scanner;

public class IntegerSum {

        int sum(int firstNumber, int secondNumber) {

           int result = firstNumber + secondNumber;

           System.out.println("\nThe sum of numbers "+firstNumber+" and "+secondNumber+" is: "+result);

           return result;

        }
    
	public static void main(String args[]) {

            int firstNumber, secondNumber;

            Scanner sc = new Scanner(System.in);

            System.out.println("\nEnter the first operand: ");

            firstNumber = sc.nextInt();

            System.out.println("\nEnter the second operand: ");

            secondNumber = sc.nextInt();

            IntegerSum obj = new IntegerSum();

            obj.sum(firstNumber, secondNumber);            
         
        }
	
}
    
