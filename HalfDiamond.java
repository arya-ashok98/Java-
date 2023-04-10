public class HalfDiamond {

	public static void main(String[] args) {

		int i, j, k, m, number;

		for(i = 0; i <= 4; i++) {

			number = 1; // to reset the number to starting ie, '1' after each iteration

			for(j = 0; j <= i; j++) {

				System.out.print(number+" ");

				number++;

			 }

		 System.out.println();

		}

		for(k = 1; k <= 4; k++) {

			number = 1;

			for(m = 4; m >= k; m--) {

				System.out.print(number+" ");

				number++;

			}

		System.out.println();

		}

	}

}