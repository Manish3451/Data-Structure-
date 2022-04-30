package matrixSearch;

import java.util.Scanner;

public class Matrixsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] arr = new int [n][m];
        for(int i = 0; i < arr.length; i++) {
        	for(int j=0; j < arr[0].length; j++) {
        		arr[i][j] = scn.nextInt();
        	}
        }
        int key = scn.nextInt();
        System.out.println(matrixsearch(arr,key));
	}
   public static int matrixsearch(int[][] arr,int key1) {
	  int minr = 0;
	  int maxc = arr[0].length-1;
	  while( maxc >= 0 && minr < arr.length ) {
		  if(arr[0][maxc] == key1) {
			  return 1;
		  }
		  else if(arr[0][maxc] > key1) {
			  maxc--;
		  }
		  else {
			  minr++;
		  }
	  }
	  return 0;
   }
}
