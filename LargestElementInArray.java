import java.util.Scanner;

public class LargestElementInArray {

	public static void main(String args[]) {

		int limit;

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter the array limit: ");

            limit = sc.nextInt();

		int[] array = new int[limit]; // array declaration

		System.out.println("\nEnter the array elements: ");

		for(int i = 0; i < limit; i++) {

			array[i] = sc.nextInt();

		}


            int largest = array[0]; // say suppose largest is the 1st element

		for(int i = 1; i < limit; i++) {

			if(array[i] > largest) {  

				largest = array[i];

			}
               
		}

		System.out.println("\nThe largest among the array elements is : "+largest);

	}

}