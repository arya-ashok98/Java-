import java.util.Scanner;

import java.io.*; // to use String class functions

public class RemoveWhitesInString {

    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.println("\nEnter the string: ");

    String input = sc.nextLine();

    String str = new String(input); // pass your string value to String constructor

    System.out.println("\nThe output: ");

    System.out.println(str.replaceAll(" ", ""));

    }

}
     
    