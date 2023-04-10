public class Employee {

			String name, address;

			int year;

			public Employee(String n, Integer yr, String addr) {     // parameterised constructor

				name = n;               //Instance variables

				year = yr;

				address = addr;

		      }

			public void displayDetails() {

				System.out.println(name+"\t"+year+"\t\t\t"+address+"\n");

			}

			public static void main(String[] args) {

				System.out.println("\nName "+"\t"+"Year of Joining "+"\t"+"Address \n");

				Employee emp1 = new Employee("Robert", 1994, "64C- WallsStreat");

				emp1.displayDetails();

				Employee emp2 = new Employee("Sam", 2000, "68D- WallsStreat");

				emp2.displayDetails();

				Employee emp3 = new Employee("John", 1999, "26B- WallsStreat");

				emp3.displayDetails();


			}

}				

			