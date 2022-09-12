package sample.arrays;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		Integer innum = new Integer(10);
		// Datatype...refvariblename...ArraySymbol....newoperator.....datatype....arraysymblwithsize
		int orenge[] = new int[5];
		orenge[0] = 1;
		orenge[1] = 1;
		orenge[2] = 1;
		orenge[3] = 1;
		orenge[4] = 1;
      //int array
		int[] oren = new int[5];

		// String array
		String[] str = { "praveen", "canal", "kumar", "robert" };
		// double array
		double[] dub = { 10.1, 10.2, 10.3 };

		// creating an array
		int[] oreng = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Before Array Modify : " + Arrays.toString(oreng));
		for (int i = 0; i < oreng.length; i++) {

			oreng[i] = oreng[i] * 100;
			System.out.println(oreng[i]);

		}
		System.out.println("After Array Modify : " + Arrays.toString(oreng));

	}

}
