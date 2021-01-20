package basic;

public class NestedForLoopExample {

	public static void main(String[] args) {

		// This is the loop of i
		for (int i = 1; i <= 3; i++) {
			// Here is the loop of j
			for (int j = 1; j <= 3; j++) {
				System.out.println(i + "" + j);
			} // close of j loop
		} // close of the i loop
	}// close of the main method

}// close of the class
