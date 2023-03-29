import java.util.Scanner;

public class DisplayArray {

	public static void main(String args[]) {

		int n, i;

		Scanner sc = new Scanner(System.in);

            	System.out.println("\nEnter the array limit: ");

           	n = sc.nextInt();

		int[] array = new int[n]; // or int array[] = new int[n];

		System.out.println("\nEnter the array elements: ");

            	for(i = 0; i < n; i++) {

			array[i] = sc.nextInt();

            	}

		System.out.println("\nThe array elements are: ");
		
		for(i = 0; i < n; i++) {

			System.out.println(array[i]);

		}

	}

}
