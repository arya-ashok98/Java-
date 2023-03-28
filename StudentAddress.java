public class StudentAddress {

		static String name1 = "Sam", name2 = "John", address, phoneNumber;

		static int rollNumber;

		public StudentAddress(int rollNumber, String phoneNumber, String address) {

			this.rollNumber = rollNumber;

			this.phoneNumber = phoneNumber;

			this.address = address;

		}


		public static void main(String args[]) {

			StudentAddress stud1 = new StudentAddress(1, "8798654065", "TC 6/8866 Sunshine Building, Daffodils Lane, Trivandrum-695011");

			System.out.println("\nName - "+name1+"\n"+"Roll number - "+rollNumber+"\n"+"Phone number - "+phoneNumber+"\n"+"Address - "+address+"\n");
			
			StudentAddress stud2 = new StudentAddress(2, "7713450976", "TC 6/8767 TopTee Apartments, River Lane, Trivandrum-695011");

			System.out.println("\nName - "+name2+"\n"+"Roll number - "+rollNumber+"\n"+"Phone number - "+phoneNumber+"\n"+"Address - "+address+"\n");

		}

}