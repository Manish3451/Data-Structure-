package insetionSort;

public class Inssertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,4,6,9,4,7};
        selectionsort(arr);
      for(int i = 0; i < arr.length; i++) {
  	  System.out.print(arr[i] + " ");
    }
	}
	public static void selectionsort(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			int j = i-1;
			int item = arr[i];
			while(j >= 0 && arr[j] > item ) {
				arr[j+1] = arr[j];
				j--;
			}
			j++;
			arr[j] = item;
		}
	}

}
