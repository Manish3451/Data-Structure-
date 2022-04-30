package numberpattern;

import java.util.Scanner;

public class numberpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           int n = scn.nextInt();
           int count = 1;
           for(int i = 0; i < n; i++) {
        	   for(int j = 0; j <= i; j++) {
        		   System.out.print(count);
        		   count++;
        	   }
        	   System.out.println();
           }
	}

}
