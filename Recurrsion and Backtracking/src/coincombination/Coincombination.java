package coincombination;
import java.util.*;

public class Coincombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int [] arr = {2,3,6,7};
        int target = 7;
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        printcombination(arr,target,ll,0,ans);
        System.out.print(ans);
	}
	public static void printcombination(int[] arr, int amount,List<Integer>  ll,int idx,List<List<Integer>> ans) {
		if(amount==0) {
			//System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i =idx; i < arr.length; i++) {
			if(amount >= arr[i]) {
				ll.add(arr[i]);
				printcombination(arr,amount-arr[i],ll,i,ans);
				ll.remove(ll.size()-1);
			}
		}
	}

}
