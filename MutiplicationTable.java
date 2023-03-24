import java.util.Scanner;

public class MutiplicationTable {

     public static void main(String args[]) {

	   int number, limit, result = 0, i;

         Scanner sc = new Scanner(System.in);

         System.out.println("\nEnter the number whose multiplication table needs to be printed: ");

         number = sc.nextInt();

         System.out.println("\nEnter the limit: ");

	   limit = sc.nextInt();

         for(i = 1; i <= limit; i++) {

            result = i * number;

            System.out.println("\nThe multiplication table for the digit "+number+" is: "+i+" * "+number+" = "+result);

         }
	}
}

          