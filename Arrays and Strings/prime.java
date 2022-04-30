package prime;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	     int n = scn.nextInt();
	     Long[] arr = new Long[n];
	     for(int i = 0; i < arr.length; i++) {
	    	 arr[i] = scn.nextLong();
	     }
	     Long max = arr[0];
	     for(int i = 0; i < arr.length; i++) {
	    	 if(arr[i]>max) {
	    		 max= arr[i];
	    	 }
	     }
	     System.out.print(max);
	}

}
