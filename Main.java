class LinkedList{
	
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
			
		}
	}
	
	public void append(int data){
		Node temp = head;
		if(head == null){
			head = new Node(data);
			return;
		}
		
		Node nd= new Node(data);
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = nd;
		nd.next = null;
		return;
	}
	public void deleteNode(int data){
		Node temp = head;
		Node prev = null;
		while(temp.next!=null){
			prev = temp;
			temp= temp.next;
		}
		prev.next = null;
		temp = null;
		
		return;
	}
	int top1(){
		Node temp = head;
		while(temp.next!=null){
			temp= temp.next;
		}
		return temp.data;
	}
	public void show(){
		Node temp = head;
		while(temp.next!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
		return;
	}
	
}
class Stack{
	int top;
	LinkedList list1 = new LinkedList();
	Stack(){
		top=-1;
	}
	 boolean push( int data){
		 list1.append(data);
			return true;
	}
	boolean pop(int data){
		if(list1.top1() == data){
			
			list1.deleteNode(data);
			
			return true;
		}
		else{
			System.out.println("not");
		}
		return true;
	}
	boolean show(){
		list1.show();
		return true;
	}
}

class Main{
	
	public static void main(String args[]){
			
			Stack st = new Stack();
			st.push(23);
			st.push(23);
			st.push(123);
			st.pop(123);
			st.push(1244);
			st.show();
			
	}
	
}
