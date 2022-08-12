package queue_game;

import java.util.Scanner;

public class queue_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scn = new Scanner(System.in);
         int t = scn.nextInt();
         while(t > 0) {
        	 
        	 int a = scn.nextInt();
        	 int[]arr= new int[a];
        	 for(int i = 0; i < arr.length; i++) {
        		 arr[i]= scn.nextInt();
        	 }
        	 
        	 if(check(arr,a)) {
        		 System.out.println("\n"+"Valid");
        	 }
        	 else {
        		 System.out.println("\n"+"Invalid");
        	 }
         }
          
	}

	private static boolean check(int[] arr, int a) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==1) {
				count++;
			}
			else {
				count--;
			}
		}
		if(count<0) {
			return false;
		}
		return true;

	}

}
