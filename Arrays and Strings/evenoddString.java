package EvenOddString;

import java.util.Scanner;

public class evenoddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scn = new Scanner(System.in);
          String str = scn.nextLine();
          System.out.print(evenodd(str));
        		  
	}
	public static String evenodd(String str ) {
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0 ; i < sb.length(); i++) {
			
			char s = str.charAt(i);
			if(i%2==0) {
				 char eve = ++s;
				 sb.setCharAt(i, eve);
				 }
			else {
				char odd = --s;
				sb.setCharAt(i, odd);
			}
		}
		return sb.toString();
	}

}
