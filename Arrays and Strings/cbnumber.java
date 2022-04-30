package Cbnumber;

import java.util.Scanner;

public class cbnumber {

	public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int l = scn.nextInt();
      String str = scn.next();
      System.out.println(Printsubstring(str));
	}
   public static int Printsubstring(String str) {
	   int count = 0;
	   boolean [] visited = new boolean[str.length()];
	   for(int len = 1 ; len <= str.length(); len++) {
		   for(int si = 0 ; si <= str.length() -len; si++) {
			   int li = si+len;
			   String s = str.substring(si,li);
			   if(iscbnumber(Long.parseLong(s)) == true && isvistied(visited, si, li - 1) == false) {
				   for(int i = si; i <= li-1; i++) {
					   visited[i] = true;
				   }
				   count++;
			   }
		   }
	   }
	   return count;
   }
   public static boolean isvistied(boolean[] visited, int si, int li) {
		
		for (int i = si; i <= li; i++) {
			if (visited[i] == true) {
				return true;
			}

		}
		return false;

	}
   public static boolean iscbnumber(long n) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		
		if (n == 0 || n == 1) {
			return false;
		}
	

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}

		
		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				return false;
			}
		}

		return true;

	}
}
