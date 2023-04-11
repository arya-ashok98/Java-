public class TriangleNumberPattern {

	public static void main(String[] args) {

		int i, j, k, number;

		for (i = 1; i <= 5; i++) {

			number = 1;

			for(k = i; k <= 5; k++) {

				System.out.print(" "); // do not use "/t"

			}

			for(j = 1; j <= i; j++) {

			System.out.print(number+" ");

			number++;

			}

		System.out.println();

		}

	}

}

	