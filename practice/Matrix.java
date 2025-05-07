package com.practice;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Rows");
		int row=sc.nextInt();
		System.out.println("Enter no of columns");
		int col=sc.nextInt();
		
		int[][] matrix=new int[row][col];
		System.out.println("Enter data");
		for(int i=0;i<row;i++) {     //i=3 j=2
			for(int j=0;j<col;j++) {
				matrix[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("your matrix: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}

