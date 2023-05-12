class OperationCallByValue {

	int number = 50;

	public void change(int number) {

		number = number + 500; //changes will be in the local variable only

	}

	public static void main(String args[]) {

		OperationCallByValue op = new OperationCallByValue();

		System.out.println("\n the value of number before: "+op.number);

		op.change(500);

		System.out.println("\n the value of number after: "+op.number);

	}

}


		