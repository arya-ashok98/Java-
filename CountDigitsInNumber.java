import java.util.Scanner;

public class CountDigitsInNumber {

     public static void main(String args[]) {

         int count = 0, number, m;

         Scanner sc = new Scanner(System.in);

         System.out.println("\nEnter the number: ");

         number = sc.nextInt();

         while(number > 0) {

	    m = number % 10;

            number = number / 10;

            count++;

         }
	    
	 System.out.println("\nThe number is a "+count+" digit number");

     }  

} 

         
