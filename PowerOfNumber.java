import java.util.Scanner;

public class PowerOfNumber {

   public static void main(String[] args) {

	int base, power, m;

	Scanner sc = new Scanner(System.in);

      	System.out.println("\nEnter the base: ");

      	base = sc.nextInt();

      	System.out.println("\nEnter the power: ");

      	power = sc.nextInt();
  
	m = base; // now the base/number is safe in variable m

      	for(int i = 1; i < power; i++) {

           m = m * base;
	}

        System.out.println("\nThe value for the number "+base+" ^ "+power+" equals to: "+m);

    }

}
