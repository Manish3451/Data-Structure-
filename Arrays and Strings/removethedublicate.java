package removetheduplicate;

import java.util.Scanner;

public class removethedublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      System.out.print(removetheduplicate(str));
	}
  public static String removetheduplicate(String str) {
	  String newString = "";
	  int n = str.length();
	  for(int i = 0;  i < str.length(); i++) {
		 
		 if(i < n-1 && str.charAt(i) == str.charAt(i+1)) {
			 continue;
	  }
		 else {
			 newString+=str.charAt(i);
		 }
  }
	  return newString;
}
}
