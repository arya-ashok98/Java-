public class Student {

	static String name;

	static int roll_no;

	public Student(String name, int roll_no) { //user-defined constructor whose tasks is to assign the values to the variables

		this.name = name;

		this.roll_no = roll_no;

	}

	public static void main(String args[]) {

		Student stud = new Student("John", 2); //calling the user-defined constructor by passing arguments

		//System.out.println("\nThe name is "+name+" and the roll number is "+roll_no); //not required to print the results

	}

}

		
