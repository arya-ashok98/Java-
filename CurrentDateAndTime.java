import java.time.format.DateTimeFormatter; // the format in which you need the output

import java.time.LocalDateTime; // to get the current date and time

public class CurrentDateAndTime {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss");

		LocalDateTime ldt = LocalDateTime.now(); // now() function in the LocalDateTime class returns the current date and time

		System.out.println("\nThe current date & time: "+(dtf.format(ldt)));

	}

}