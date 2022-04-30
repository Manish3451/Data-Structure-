package bubblesort;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int[] arr = new int[n];
          for(int i1 = 0; i1 < arr.length; i1++) {
        	  arr[i1] = scn.nextInt();
          }
          bubblesort1(arr);
          displayarr(arr);
        
	}
	public static void bubblesort1(int[] arr) {
		for(int turn = 1; turn < arr.length; turn++) {
			for(int j = 0; j < arr.length-turn; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	public static void displayarr(int[] arr) {
        for(int i2 = 0; i2 < arr.length; i2++) {
      	  System.out.println(arr[i2]);
        }
        }

}
