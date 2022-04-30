package stringtogglecase;

import java.util.Scanner;

public class stringtoggleclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scn = new Scanner(System.in);
         String str = scn.nextLine();
         System.out.print(toggle(str));
	}
	public static String toggle(String str) {
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0; i < sb.length(); i++) {
			char s = str.charAt(i);
		
		if( s >= 'a' && s <= 'z') {
			char up = (char)('A' + s - 'a');
			sb.setCharAt(i, up);
		}
		else {
			char lc = (char)('a' + s - 'A');
			sb.setCharAt(i, lc);
		}
		}
		return sb.toString();
	}

}
