import java.util.Scanner;

public class Palindrome {

   	public static void main(String args[]) {

		int number, m, n, rev = 0;

		Scanner sc = new Scanner(System.in);

      		System.out.println("\nEnter the number to be checked for palindrome: ");

      		n = sc.nextInt();

      		number = n;

      		while(n > 0) {

			m = n % 10;

            		rev = rev * 10 + m;

            		n = n / 10;

      		}

      		if (rev == number) {

			System.out.println("\nThe given number "+number+" is palindrome.");

		}

		else {

			System.out.println("\nThe given number "+number+" is not palindrome.");
	
		}

   	}

}
