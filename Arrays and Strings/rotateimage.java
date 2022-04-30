package rotateimage;

import java.util.Scanner;

public class rotateimage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int [][] arr = new int [n][n];
        for(int  i = 0; i < arr.length; i++) {
        	for(int j = 0; j < arr[0].length; j++) {
        		arr[i][j] = scn.nextInt();
        	}
        }
            transpose(arr);
            reverserow(arr);
            for ( int i = 0; i < arr.length; i++) {
    			for (int j = 0; j < arr[0].length; j++) {
    				System.out.print(arr[i][j] + " ");
    			}
    			System.out.println();
    		}
        }
    
            public static void transpose(int[][]arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr[0].length; j++ ){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]=temp;

            }
        }
	}
         public static void reverserow(int[][] arr) {
        	 for(int j = 0; j <= arr.length-1; j++) {
        		 int ur = 0;
        		 int lr = arr.length-1;
        		 while(ur < lr) {
        			 int temp = arr[ur][j];
        			 arr[ur][j] = arr[lr][j];
        			 arr[lr][j]=temp;
        			 ur++;
        			 lr--;
        		 }
        		
        	 }
         }
}
