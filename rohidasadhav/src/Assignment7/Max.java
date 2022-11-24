package Assignment7;
//Java program to find the minimum and
//maximum value of the ArrayList

import java.util.*;
public class Max {
	public static void main(String args[])
	{

		// initializing the ArrayList elements
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(8);
		arr.add(32);
		arr.add(21);
		arr.add(31);

		int min = arr.get(0);
		int max = arr.get(0);

		// store the length of the ArrayList in variable n
		int n = arr.size();

		// loop to find minimum from ArrayList
		for (int i = 1; i < n; i++) {
			if (arr.get(i) < min) {
				min = arr.get(i);
			}
		}

		// loop to find maximum from ArrayList
		for (int i = 1; i < n; i++) {
			if (arr.get(i) > max) {
				max = arr.get(i);
			}
		}

		// The result will be printed
		System.out.println("Maximum is : " + max);
		System.out.println("Minimum is : " + min);
	}
}


