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
	public void push(int d){
		
		if(head == null){
			head = new Node(d);
			return;
		}
		Node temp = head;
		
		Node new_Node = new Node(d);
		
		while(temp.next!=null){
			temp = temp.next;
			
		}
		
		temp.next = new_Node;
		 return;
		
	}
	public void show(){
		
		Node temp = head;
		while(temp.next!= null){
			
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
		
	}
	
	public void reverse1(){
		
		Node prev = null;
		Node current = head;
		Node next = head;
		
		while(current.next!=null){
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		current.next = prev;
		head = current;
		return;
		
	}
	public void reverse2(){
		Node current = head;
		Node next = null;
		head = null;
		while(current.next != null){
			next = current.next;
			current.next = head;
			head = current;
			current = next;
			
			
		}
		current.next  = head;
		head = current;
		return;
	}
	public static void main(String args[]){
		
		LinkedList list1 = new LinkedList();
		list1.push(12);
		list1.push(1);
		list1.push(132);
		list1.push(122);
		list1.push(1232);
		list1.reverse1();   //using three reference
		list1.reverse2();  // using two reference
		list1.show();
		
	}
}
