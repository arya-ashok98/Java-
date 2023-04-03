public class PatternNumber {

	public static void main(String[] args) {

		int i, j, number = 0;

		for(i = 0; i <= 4; i++) {

			number++;

			for(j = 0; j <= i; j++) {

				System.out.print(number+" ");

			 }

		 System.out.println();

		}

	}

}