package queue_reverse;
import dynamic_queue.dynamic_queue;
public class queue_reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dynamic_queue dq = new dynamic_queue();     
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);

		dq.Display();
		System.out.println("***************");
		Reverse(dq);
		dq.Display();
	}

	private static void Reverse(dynamic_queue dq) throws Exception {
		// TODO Auto-generated method stub
		if(dq.isfull()) {
			return;
		}
		int x = dq.dequeue();
		Reverse(dq);
		dq.enqueue(x);
		
	}

}
