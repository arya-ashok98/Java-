// In case of call by reference original value is changed if we made changes in the called method.

class OperationCallByReference {

		int number = 50;

		void change(OperationCallByReference op){

			op.number = op.number + 100; // changes will be there in the instance variable

		}

		public static void main(String args[]) {

			OperationCallByReference op = new OperationCallByReference();

			System.out.println("\nThe value of number before: "+op.number);

			op.change(op); // calling method by passing parameter as object

			System.out.println("\nThe value of number after: "+op.number);

		}
}
		

		