package Kth_root;

import java.util.Scanner;

public class kthroot {

    public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
	
	
        
        long n = scn.nextLong();
        int k = 2;
        System.out.println(get_nthroot(n,k));
	
   
    }
    public static long get_nthroot(long n,int  k){
        long low = 1;
        long high = n;
        long x = 0 ;
        while(low <= high){
            long mid = (high+low)/2;
            if(power(mid,k,n)==true) {
            	x = mid;
            	low = mid+1;
            }
           
            else{
                high = mid -1;
            }
        }
        return x;
        
    }
    public  static boolean power(long number,long k1,long n1){
        if((long)(Math.pow(number,k1))<= n1){
        	return true;
        }
        else {
        	return false;
        }
    }
}
