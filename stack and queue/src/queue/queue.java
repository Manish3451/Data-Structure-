package queue;

public class queue {

  protected int[] data;
  protected int front=0;
  private int size = 0;
  
  public queue() {
	  this.data = new int[5];
  }
  public queue(int cap) {
	  this.data= new int[cap];
  }
  public boolean isempty() {
	  return this.size==0;
  }
  public boolean isfull() {
	  return this.size == this.data.length;
  }
  public int size() {
	  return this.size;
  }
  
  public void enqueue(int item) throws Exception{
	  if(isfull()) {
		  throw new Exception("yaar full hai");
	  }
	  int i =(this.size+this.front)%this.data.length;
	  this.data[i] = item;
	  this.size++;
  }
  
  public int dequeue() throws Exception{
	  if(isempty()) {
		  throw new Exception("yaar kahli hai");
	  }
	  int rv = this.data[this.front];
	  this.front = (this.front+1) % this.data.length;
	  this.size--;
	  return rv;
  }
  
  public int getFront() throws Exception{
	  if (isempty()) {
			throw new Exception("Sun Pgl hai ?? Queue Khaali hai ");
		}
	  return this.data[this.front];
  }
  
  public void Display() {
	  for(int i = 0; i < this.size; i++) {
		  int idx = (this.front+i) % this.data.length;
		  System.out.print(this.data[idx]+" ");
	  }
	  System.out.println();
  }
  
  
  
  
  
  
}
