package com.avisys.loop;

public class LeveledForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using label for and outer loop
		aa: for (int i = 1; i < 3; i++) {
			bb: for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					break aa;
				}

				System.out.println(i + "" + j);
			}
		}

	}

}
