package Stringcompression;

import java.util.Scanner;

public class Stringcompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       String str = scn.nextLine();
       System.out.print(Stringcompression(str));        
	}
	public static String Stringcompression(String str) {
		String s = str.charAt(0)+"";
		int count = 1;
		for(int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			if(curr==prev) {
				count++;
			}
			else {
				if(count>1) {
					s = s + count;
					count = 1;
				}
				s = s + curr;
			}
		}
		if(count>1) {
			s = s + count;
			count = 1;
		}
		return s;
		
	}

}
