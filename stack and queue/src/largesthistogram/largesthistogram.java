package largesthistogram;

import java.util.*;

public class largesthistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner scn = new Scanner(System.in);
             int n = scn.nextInt();
             int [] arr = new int[n];
             for(int i = 0; i < arr.length; i++) {
            	 arr[i] = scn.nextInt();
             }
             int [] rb = new int[arr.length];
             Stack<Integer> st  = new Stack<>();
             st.push(arr.length-1);
             rb[arr.length-1]=arr.length;
             
             
             for(int i = arr.length-2; i >= 0; i--) {
                    while(st.size() > 0 && arr[i] <= st.peek() ) {
                    	st.pop();
                    }
                    if(st.size()==0) {
                    	rb[i] = arr.length;
                    }
                    else {
                    	rb[i]=st.peek();
                    }
                    st.push(i);
             }
             int [] lb = new int[arr.length];
              st  = new Stack<>();
             st.push(0);
             lb[0]=-1;
             
             
             for(int i = 1; i < arr.length; i++) {
                    while(st.size() > 0 && arr[i] <= st.peek() ) {
                    	st.pop();
                    }
                    if(st.size()==0) {
                    	lb[i] = -1;
                    }
                    else {
                    	lb[i]=st.peek();
                    }
                    st.push(i);
             }
             
             int max = 0 ;
             for(int i = 0; i < arr.length; i++) {
            	 int area= arr[i]*(rb[i]-lb[i]-1);
            	 if(area > max) {
            		 max= area;
            	 }
             }
             System.out.print(max);
	}

}
