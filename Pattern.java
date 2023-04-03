public class Pattern {

	public static void main(String[] args) {

		int i, j, number;

		for(i = 0; i <= 4; i++) {

			number = 1; // to reset the number to starting ie, '1' after each iteration

			for(j = 0; j <= i; j++) {

				System.out.print(number+" ");

				number++;

			 }

		 System.out.println();

		}

	}

}