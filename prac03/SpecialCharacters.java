package com.prac03;

public class SpecialCharacters {

	public static void main(String[] args) {


		String s="abce!34&*60f@";
		char[] c=s.toCharArray();
		
		int front=0;
		int back=c.length-1;
		
		while(front<back) {
			if(!Character.isLetterOrDigit(c[front])) {
				front++;
			}else if(!Character.isLetterOrDigit(c[back])) {
				
				back --;
			}
			else {
				char temp=c[front];
				c[front]=c[back];
				c[back]=temp;
				front++;
				back--;
				
			}
		}
		
		System.out.println(new String(c));
		
	}

}
