import java.util.Scanner;

public class ReverseNumber {

    public static void main(String args[]) {

     	int rev = 0, number, m = 0;

     	Scanner sc = new Scanner(System.in);

     	System.out.println("\nEnter the number to be reversed: ");

     	number = sc.nextInt();

     	while(number > 0) {

        	m = number % 10;

        	rev = rev * 10 + m;

        	number = number / 10;
        }

        System.out.println("\nThe reverse of the number is: "+rev);

   }

}
