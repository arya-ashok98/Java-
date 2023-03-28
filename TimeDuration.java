// Importing the LocalTime class to parse the date in the format HH:MM:SS

import java.time.*;

// Importing the ChronoUnit class to get the difference in hours, minutes and seconds.

import java.time.temporal.ChronoUnit;

import java.util.Scanner;

public class TimeDuration {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

            	System.out.println("\nFor the start time ");

            	System.out.println("\nEnter the hour: ");

		int timehr1 = sc.nextInt();
	
		System.out.println("\nEnter the minutes: ");

           	int timemin1 = sc.nextInt();

		System.out.println("\nEnter the seconds: ");

	      	int timesec1 = sc.nextInt();

		System.out.println("\nFor the end time: ");

		System.out.println("\nEnter the hour: ");

		int timehr2 = sc.nextInt();
	
		System.out.println("\nEnter the minutes: ");

            	int timemin2 = sc.nextInt();

		System.out.println("\nEnter the seconds: ");

	      	int timesec2 = sc.nextInt();

		LocalTime time1 = LocalTime.of(timehr1, timemin1, timesec1);  // Parsing Time Period in the format HH:MM:SS

  		LocalTime time2 = LocalTime.of(timehr2, timemin2, timesec2); // Parsing Time Period in the format HH:MM:SS

		long hours = ChronoUnit.HOURS.between(time1, time2); // Calculating the difference in Hours

		long minutes = ChronoUnit.MINUTES.between(time1, time2) % 60;  // Calculating the difference in Minutes

		long seconds = ChronoUnit.SECONDS.between(time1, time2) % 60; // Calculating the difference in Seconds

		System.out.println("\nThe difference between the time "+time1+" and "+time2+" is: "+hours+" hours "+minutes+" minutes "+seconds+" seconds");

	}

}

            
