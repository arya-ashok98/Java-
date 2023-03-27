import java.util.Scanner;

public class AverageUsingArray {

	public static void main(String args[]) {

            int sum = 0, limit;

		Scanner sc = new Scanner(System.in);

            System.out.println("\nEnter the limit for the array: ");

            limit = sc.nextInt();

            int[] array = new int[limit];

            System.out.println("\nEnter the array elements: ");

            for (int i = 0; i < limit; i++) {

			array[i] = sc.nextInt();

            }

		for (int i = 0; i < limit; i++) {

			sum += array[i];

            }

            float average = sum/limit;

            System.out.println("\nThe average of the array elements is : "+average);

	}

}
                  



            