import java.util.Scanner;

public class Factorial {

     public static void main(String args[]) {

         int number, fact = 1, i;

         Scanner sc = new Scanner(System.in);

         System.out.println("\nEnter the number: ");

         number = sc.nextInt();

         for(i = number; i >= 1; i--) {
     
		fact = fact * i;
         }

	 System.out.println("\nThe factorial of the number "+number+" is: "+fact);

	} 
}
