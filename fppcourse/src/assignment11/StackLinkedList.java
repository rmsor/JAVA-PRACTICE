package assignment11;

import java.util.LinkedList;

class StackList{
	private LinkedList list=new LinkedList();
	
	public void push(Object v){
		list.add(v);
	}
	public void pop(){
		list.removeFirst();
	}
	public void peek(){
		System.out.println(list.getFirst());
	}
	public int size(){
		return list.size();
	}
	public boolean isEmpty(){
		if(list.size()>0){
			return false;
		}else{
			return true;
		}
	}
	public void print(){
		System.out.println(list);
	}
}

public class StackLinkedList {

	public static void main(String[] args) {
		StackList lst=new StackList();
		lst.push("Ram");
		lst.push("Shyam");
		lst.push("Dinesh");
		lst.print();
		lst.pop();
		lst.print();
		lst.peek();
		System.out.println("Size of Stack:"+lst.size());
		System.out.println("Stack is Empty :"+lst.isEmpty());
	}

}
