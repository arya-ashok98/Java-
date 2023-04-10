public class ReverseNumberKPatterns {

	public static void main(String[] args) {

		int i, j, k, m;

		for(i = 5; i >= 1; i--) {

			for(j = i; j >= 1; j--) {

				System.out.print(j+" ");

			}

			System.out.println();

		}

		for(k = 1; k <= 5; k++) {

			for(m = k; m >= 1; m--) { // since in first row we need only 1 to be printed m will be assigned the value of 'k' i.e, 1 & the condition limits it by checking if its >=1 alone and since the m value gets decrem the value of m turns to 0 which no longer holds the condition and gets out of the m for loop and the k value gets increm to 2, and m will now be having value 2 so based on the condition 2 no.s can be printed as based on our need of 2 numbers in second row... and hence the logic works!!

				System.out.print(m+" ");

			}

			System.out.println();

		}

	}

}

				