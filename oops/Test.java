package com;

public class Test {
	//second highest number in array
	public static void main(String[] args) {
		
			int arr[]= {1,2,3,4,5,6,7};
			
			int largest=Integer.MIN_VALUE;
			int secondLargest=Integer.MIN_VALUE;
			int thirdLargest=Integer.MIN_VALUE;
			
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]>largest) {
					thirdLargest=secondLargest;
					secondLargest=largest;
					largest=arr[i];
				}else if( arr[i]> secondLargest && arr[i]!= largest  ) {
					thirdLargest=secondLargest;
					secondLargest=arr[i];
				}else if(arr[i]>thirdLargest && arr[i]!=secondLargest) {
					thirdLargest=arr[i];
				}
			}
			System.out.println(thirdLargest);
		
			
		
	}

}
