import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String args[]) {

      int n, temp;

      Scanner sc = new Scanner(System.in);

      System.out.println("\nEnter the number: ");

      n = sc.nextInt();

      if(n == 0 || n == 1) {

		System.out.println("\nThe number "+n+" is not prime");

      }

	for(int i = 2; i <= (n-1); i++) {

         temp = n % i;

         if(temp == 0) {

            System.out.println("\nThe number "+n+" is not prime");

            break;
          }

         else {

              System.out.println("\nThe number "+n+" is  prime");

              break;

         }

      }

      }

}
         
	

     