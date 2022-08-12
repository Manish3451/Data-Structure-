package queencombination;

import java.util.Scanner;

public class queencombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn = new Scanner(System.in);
      boolean[] board= new boolean[4];
      int nq=2;
      queencomb(board,nq,0,"",0);
      }
	public static void queencomb(boolean[] board,int tq, int qpsf,String ans,int idx) {
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		
		for(int i = idx ; i < board.length; i++) {
			if(board[i]==false) {
				board[i]=true;
			queencomb(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
			board[i]=false;
			}
		}
	}

}
