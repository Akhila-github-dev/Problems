package StringsPractice;

import java.util.Arrays;

public class ex3 {

	public static void main(String[] args) {
		String str[]= {"abc","def","ghi"};
		
//		String res="";
//		for(int i=0;i<str.length;i++) {
//			for(int j=0;j<str.length;j++) {
//			char sr=str[j].charAt(i);
//			
//			res=res+sr;
//			}
//		}
//		System.out.println(res);
		
		String ans[]=new String[str[0].length()];
		for(int i=0;i<ans.length;i++) {
			ans[i]="";
		}
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str.length;j++) {
				String s=str[j];
				ans[i]+=s.charAt(i);
			}
		}
		System.out.println(Arrays.toString(ans));
	}
	
}
