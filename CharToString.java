class CharToString {

 	public static void main(String args[]) {

   		char input = 'K';

		String data = "Morning!! Sunshine";

  		String inputStr = Character.toString(input); // conversion using toString() method (widely used)

		//String inputStr = "" + input; // converting by concatenating method (rarely used)

		//String inputStr = String.valueOf(input); // conversion using valueOf() method (widely used)

   		System.out.println("\nThe string value: " +inputStr+"\n");

		char dataChar[] = data.toCharArray(); // converting the string to character array

		for(char c : dataChar) {

			System.out.print(c + " ");

		}
 
 	}

}
