package assignment11;
class QueueImp{
	private static final int capacity = 25;  
	int arr[] = new int[capacity];  
	int size = 0;  
	int top = -1;  
	int rear = 0;  
 
	public void insert(int elem) {  
	 if (top < capacity - 1) {  
		  top++;  
		  arr[top] = elem;  
	  System.out.println("Element " + elem + " is inserted into Queue !");  
	 } else {  
		 System.out.println("Overflow !");  
	 }  
	}  
 
	public void remove() {  
	 if (top >= rear) {  
		 System.out.println(arr[rear]+" removed successfully !");
		  rear++;  
	 } else {  
		 System.out.println("Underflow !");  
	 }  
	}
	
	public boolean isEmpty() {  
		if(top==-1){
			return true;
		}else{
			return false;
		}
	}
	public int size(){
		return size;
	}
	public int peek(){
		return arr[top];
	}
 
	public void display() {  
	 if (top >= rear) {  
	  System.out.println("Elements in Queue : ");  
	  for (int i = rear; i <= top; i++) {  
	   System.out.println(arr[i]);  
	  }  
	 }  
	}
}	
public class UserImpQueue {

	public static void main(String[] args) {
		QueueImp queEg=new QueueImp();
		queEg.insert(12);
		queEg.insert(5);
		queEg.insert(4);
		queEg.insert(3);
		queEg.display();
		queEg.remove();
		queEg.display();
		System.out.println("Element at Top: "+queEg.peek());
		System.out.println("Size of Queue is: "+queEg.size());
		System.out.println("Queue is Empty :"+queEg.isEmpty());
		
	}

}
