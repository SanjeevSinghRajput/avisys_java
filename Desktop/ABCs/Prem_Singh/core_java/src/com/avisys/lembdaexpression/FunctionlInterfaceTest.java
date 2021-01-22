package com.avisys.lembdaexpression;

public class FunctionlInterfaceTest {

	public static void main(String[] args) {
		
		
		// annonymous class
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("I just implemented the functional interface.....");
				
			}
		}).start();
		

	}

}
