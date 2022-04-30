package palindromStrings;

import java.util.Scanner;

public class palindromeStrings {
	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
     String str = scn.nextLine();
     System.out.print(palindromic(str));
}
	public static boolean palindromic(String str ) {
		int i = 0 ;
		int j = str.length()-1 ;
		while(i <= j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}
}

