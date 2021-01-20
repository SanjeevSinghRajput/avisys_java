package basic;

//This is the program of the factorial 6
public class Anonymous_class_Object {
	// Here we declare the fact method
	void fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial is----:>   " + fact);

	}

	public static void main(String[] args) {
		new Anonymous_class_Object().fact(6);//calling method with anonymous object 
	}

}
