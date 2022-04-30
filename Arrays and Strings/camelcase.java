package camalcase;

import java.util.Scanner;

public class camelcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scn = new Scanner(System.in);
         String str = scn.nextLine();
         int i ;
         int first = 0;
         int end = 0;
         boolean count = true;
         for( i = 0; i < str.length(); i++) {
        	 if(Character.isUpperCase(str.charAt(i))) {
                  if(count) {
                	  end = i;
                	  System.out.println(str.substring(first,end));
                	  first = i;
                  }
                  else {
                	  first = i;
                	  count = false;
                  }
        	 }
        	 }
         System.out.println(str.substring(first));
         }
         
	}


