package com.prac03;

public class Distinctelements {

	public static void main(String[] args) {


		int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
	//sorted array remove duplicates
    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {  //1=1
                i++; //1
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

	}

(or)

	int arr[]= {1,1,2,2,3,4,5};
	int index=0;
for(int i=0;i<arr.length;i++) {
		boolean isduplicate=false;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				isduplicate=true;
				break;
			}
		}
	if(!isduplicate) {
			arr[index++]=arr[i];
		}
	}
for(int i=0;i<index;i++) {
syso(arr[i]);
}
