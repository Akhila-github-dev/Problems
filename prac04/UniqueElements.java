package com.prac04;

import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 3, 4, 4, 5, 6 };

		for (int i = 0; i < a.length; i++) {
			boolean isUnique = true;

			for (int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					isUnique = false;
					break;
				}
			}

			if (isUnique) {
				System.out.print(a[i] + " ");
			}
		}
		
		//or
		
		//??***************************************************

		Set<Integer> uniqueElements = new HashSet<>();
		Set<Integer> duplicateElements = new HashSet<>();

		for (int num : a) {
			if (!uniqueElements.add(num)) {
				duplicateElements.add(num);
			}
		}

		uniqueElements.removeAll(duplicateElements);

		System.out.println("Desired output: " + uniqueElements);
	}

	
	
	}

