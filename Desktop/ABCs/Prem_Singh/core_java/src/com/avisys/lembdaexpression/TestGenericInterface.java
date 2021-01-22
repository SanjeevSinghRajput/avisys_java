package com.avisys.lembdaexpression;

public class TestGenericInterface {

	public static void main(String[] args) {
		// Declare a reference to generic interface
		// the generic interface operates on string data
		// assign a lambda expression to it

		GenericInterface<String> reverse = (str) -> {

			String result = "";
			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);

			return result;

		};
		
		System.out.println("lambda reversed="+reverse.func("SANJEEVSINGHRAJPUT"));
		
		  GenericInterface<Integer> factorial = (n) -> {

	            int result = 1;
	            for (int i = 1; i <= n; i++)
	            result = i * result;
	            return result;
	        };

	        System.out.println("factorial of 5 = " + factorial.func(5));
	}

}
