package com.prac04;

import java.util.Arrays;

public class MovepositivestoBack {

	public static void main(String[] args) {
		int arr[] = { -9, 5, 1, 7, -6, -2, 12 };

		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				if (i != j) {

					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				
				j++;

			}

		}
		System.out.println(Arrays.toString(arr));
	}
}
