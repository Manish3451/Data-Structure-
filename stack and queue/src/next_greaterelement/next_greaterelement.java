package next_greaterelement;

import java.util.*;

public class next_greaterelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      for(int i = 0;  i < arr.length; i++) {
    	  arr[i]= scn.nextInt();
      }
      long  [] nge = new long [arr.length];
      Stack<Integer> st = new Stack<>();
      nge[arr.length-1] = -1;
      st.push(arr[arr.length - 1]);
      for(int i= arr.length-2; i >= 0; i--) {
    	  
    	  while(st.size() > 0 && arr[i]>=st.peek()) {
    		  st.pop();
    	  }
    	  if(st.size()>0) {
    		  nge[i]= st.peek();
    	  }
    	  else {
    		  nge[i]=-1;
    	  }
    	  st.push(arr[i]);
      }
       for(int i= 0; i < nge.length; i++) {
    	   System.out.println(arr[i] + " " + nge[i]);
       }
	}

}
