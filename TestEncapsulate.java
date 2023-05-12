class Encapsulate {

	private int geekAge;

	private String geekName;

	private int geekRoll;

	public int getAge(){

		return geekAge;

	}

	public String getName() {

		return geekName;

	}

	public int getRoll() {

		return geekRoll;

	}

	public void setAge(int age) {

		geekAge = age;

	}

	public void setName(String name) {

		geekName = name;

	}

      public void setRoll(int roll) {

		geekRoll = roll;

	}

}

public class TestEncapsulate {	

	public static void main(String args[]) {

		Encapsulate encp = new Encapsulate();

		encp.setAge(19);

		encp.setName("Arun");

		encp.setRoll(10);

		System.out.println("\nThe Geeks name is : "+encp.getAge());

		System.out.println("\nThe Geeks name is : "+encp.getName());

		System.out.println("\nThe Geeks name is : "+encp.getRoll());

	}

}


	
	

