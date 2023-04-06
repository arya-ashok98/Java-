import java.io.*;

public class WriteToFile {

	public static void main(String args[]) {

		String data = "Greetings!";

		try {

			FileWriter fwriter = new FileWriter("Sample.txt"); // this is just an object creation for FileWriter class to access its write() method

			fwriter.write(data); // Note: This will rewrite the content in the file if any

			System.out.println("\nThe data is written to the file successfully");

			fwriter.close(); // closes the writer

		}

		catch(Exception e) {

			e.getStackTrace();

		}

	}

}