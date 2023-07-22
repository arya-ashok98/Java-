class Address {

	int id;

	String houseNumber;

	String houseName;

	String location;

	String city;

	int pinCode;

	public Address() {

	}

	public Address(String houseNumber, String houseName, String location, String city, int pinCode) {

		this.houseNumber = houseNumber;

		this.houseName = houseName;

		this.location = location;

		this.city = city;

		this.pinCode = pinCode;

	}
	
}



class Employee {

	 int id;

	String name;

	/*String houseNumber;

	String houseName;

	String location;

	String city;

	int pinCode;*/

	Address address; // Aggregation

	String designation;

	public Employee() { // default constructor


	}

	public Employee(String name, Address address, String designation) {

		this.name = name;

		this.address = address;

		this.designation = designation;

	}

	public void displayEmpDetails() {

		System.out.println(this.name);

		//System.out.println(this.houseNumber + " " + this.houseName + "" + this.location + "" + this.city + "" +this.pinCode);

		System.out.println(address.houseNumber + " " + address.houseName + " " + address.location + " " + address.city + " " + address.pinCode);

	}

}


public class AggregationMain {


	public static void main(String args[]) {

		Address address = new Address("TC 5/9877", "Manzil Villa", "Pattom", "Tvm", 695121);

		Employee employee = new Employee("Sam", address, "Software Engineer");

		employee.displayEmpDetails();

	}

}

			
	
	
		