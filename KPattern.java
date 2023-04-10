public class KPattern {

	public static void main(String[] args) {

		int i, j, k, m, number;

		for(i = 1; i <= 5; i++) {

			number = 1;

			for(j = 5; j >= i; j--) {

				System.out.print(number+" ");

				number++;

			 }

		System.out.println("");

		}

		for(k = 1; k <= 5; k++) {

			number = 1; // to reset the number to starting ie, '1' after each iteration

			for(m = 1; m <= k; m++) {

				System.out.print(number+" ");

				number++;

			 }

		 System.out.println();

		}

	}

}