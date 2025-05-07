package com.prac03;

import java.util.Arrays;

public class LeftrotateArrayByone {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		// 2,3,4,5,1

		int u = arr[0];
		int j = 0;

		for (int i = 1; i < arr.length; i++) {
			arr[j++] = arr[i];

		}
		arr[arr.length - 1] = u;
		System.out.println(Arrays.toString(arr));

	}

}
