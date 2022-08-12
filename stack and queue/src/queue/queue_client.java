package queue;

public class queue_client {
  
	public static void main(String[] args) throws Exception {
        queue qq = new queue();
        qq.enqueue(10);
        qq.enqueue(20);
        qq.enqueue(30);
        qq.enqueue(40);
        qq.enqueue(50);
        qq.Display();
        System.out.println(qq.dequeue());
		System.out.println(qq.dequeue());
		qq.Display();
		qq.enqueue(50);
		qq.enqueue(60);
		qq.enqueue(70);
		qq.Display();
        
	}
}