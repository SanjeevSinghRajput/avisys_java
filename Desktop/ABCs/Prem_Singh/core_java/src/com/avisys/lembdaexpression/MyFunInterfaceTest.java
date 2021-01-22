package com.avisys.lembdaexpression;

public class MyFunInterfaceTest {
	public static void main(String[] args) {

		// declare a reference to myinterface
		MyInterface1 ref;

		// lambda expression

		ref = () -> 3.145;
		System.out.println("Value of PI=" + ref.getPivalues());

	}
}
