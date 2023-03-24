import java.util.Scanner;

public class Fibonocci {

    public static void main(String args[]) {

    	int a = 0, b = 1, c = 0, range, i;

    	Scanner input = new Scanner(System.in);

    	System.out.println("\nEnter the range of the series: ");

    	range = input.nextInt();

    	for(i = 0; i <= range; i++) {

        	System.out.println("\n"+a);

		c = a + b;

        	a = b;

       		b = c;

        }

     }

}

