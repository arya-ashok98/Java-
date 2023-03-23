import java.util.Scanner;

public class LargestAmongThreeNumbers {

     public static void main(String args[]) {

                int firstNum, secondNum, thirdNum;

	        Scanner input = new Scanner(System.in);

		System.out.println("\nEnter the first number: ");

		firstNum = input.nextInt();

		System.out.println("\nEnter the second number: ");

        	secondNum = input.nextInt();

		System.out.println("\nEnter the third number: ");

                thirdNum = input.nextInt();

                if (firstNum > secondNum && firstNum > thirdNum) {
		    
		    System.out.println("The largest among the numbers "+firstNum+","+secondNum+","+thirdNum+" is: "+firstNum);
                }

	        else if (secondNum > thirdNum) {
			
	            System.out.println("The largest among the numbers "+firstNum+","+secondNum+","+thirdNum+" is: "+secondNum);

                }

		else {
			
		    System.out.println("The largest among the numbers "+firstNum+","+secondNum+","+thirdNum+" is: "+thirdNum);

		}

     }

}


	
