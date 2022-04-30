package countnumberofpalindromicstringsd;

import java.util.Scanner;

public class Countpalindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         String a= sc.next();
         int count = 0;
		for(int i=0;i<a.length();i++){ //check termination condition
             for (int j=i+1;j<=a.length();j++){
                 String k=a.substring(i, j);
                 if(isPal(k)==true){
                     count++;
                 }
             }
         } 
         System.out.println(count);
 }
 public static boolean isPal(String a) {
     int i=0, j= a.length()-1;
         while(i<j){
             if(a.charAt(i)!=a.charAt(j)){
                 return false;
             } 
             i++;j--; 
         } return true;
     
	}
}