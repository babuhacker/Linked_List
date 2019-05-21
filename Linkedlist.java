import java.util.*;
class LinkedList{
	
	Node head;
	
 static class Node{
	 int data;
	Node next;
	 Node(int d){
		data = d;
		next = null; 
	 }
	 
 }
	
public void printList(){
	
	Node n = head;
	while(n!= null){
		System.out.println(n.data);
		n = n.next;
	}
	
}
	
public static void main(String args[]){
	
	LinkedList list1 = new LinkedList();
		
	list1.head = new Node(3);
	Node first= new Node(4);
	Node second= new Node(5);
			
	list1.head.next = first;
	first.next = second;
	list1.printList();
	
}
	
}
