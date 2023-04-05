import java.util.Scanner;

public class CheckValueInArray {

	public static void main(String[] args) {

		int flag = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter the array limit: ");

		int limit = sc.nextInt();

		int[] arr = new int[limit];

		System.out.println("\nEnter the array elements: ");

		for(int i = 0; i < limit; i++) {

			arr[i] = sc.nextInt();            //allocating the array with user values

		}

		//System.out.println("\nThe inputed array: ");
		
		/*for(int i = 0; i < limit; i++) {

			System.out.print(arr[i] + " ");  //for displaying the input array

		}*/

		System.out.println("\nEnter the value to be checked in the array: ");

		int searchElement = sc.nextInt();


		for(int i = 0; i < limit; i++) {


			if(arr[i] == searchElement) {

				flag = 1;

			}

			/*else {

				flag = 0; // no need of else

			}*/

		}

		if(flag == 1) {

			System.out.println("\nThe searched element is present in the array");

		}

		else {

			System.out.println("\nThe searched element is not in the array");

		}

	}

}