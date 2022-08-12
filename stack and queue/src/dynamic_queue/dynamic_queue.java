package dynamic_queue;
import  queue.queue;
public class dynamic_queue extends queue {
    @Override
	public  void enqueue(int item) throws Exception {
		// TODO Auto-generated method stub
       if(super.isfull()) {
    	   int [] arr = new int [2*super.data.length];
    	  for(int i = 0; i < super.data.length; i++) {
    		  int idx = (this.front + i) % this.data.length;
				arr[i] = data[idx];
    	  }
    	  this.data = arr;
		  this.front = 0;
       }
       super.enqueue(item);
	}

}
