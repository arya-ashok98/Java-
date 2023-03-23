import java.util.Scanner;

public class IntegerSum {

        int sum(int firstNumber, int secondNumber) {

           int result = firstNumber + secondNumber;

           System.out.println("The sum of numbers "+firstNumber+" and "+secondNumber+" is: "+result);

           return result;

        }

         
	   public static void main(String args[]) {

            int firstNumber, secondNumber, result;

        	Scanner sc = new Scanner(System.in);

        	System.out.println("Enter the first operand: ");

        	firstNumber = sc.nextInt();

        	System.out.println("Enter the second operand: ");

        	secondNumber = sc.nextInt();

         
            IntegerSum obj = new IntegerSum();

            obj.sum(firstNumber, secondNumber);            
         
         }

}

         