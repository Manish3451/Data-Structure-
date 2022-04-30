package asciivalues;

import java.util.Scanner;

public class asciivalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(differenceString(str));
        
	}
	public static String differenceString(String str) {
		StringBuilder sb = new StringBuilder();
		int i ;
		for( i = 0 ; i < str.length()-1; i++) {
			int difference = str.charAt(i+1) - str.charAt(i);
           sb.append(str.charAt(i)).append(difference);
           }
		sb.append(str.charAt(i));
		return sb.toString();
	}

}
