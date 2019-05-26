//3:04 am
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

		new_Node.next = null;
		
	}
	public void show(){
		
		Node temp = head;
		
		
		while(temp.next != null){
			
			System.out.println(temp.data);
			temp= temp.next;
			
			
			
			
			
		}
		System.out.println(temp.data);
		
	}
	public void deleteNode(int d){
		Node temp = head;
		Node temp2=null;
		while(temp.data != d){
			temp2 = temp;
			temp = temp.next;
		}
		temp2.next= temp.next;
		temp = null;
		
		
	}
	
	
	
	public static void main(String args[]){
		
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		
		list1.push(2);
		list1.push(3);
		list1.push(21);
		list1.push(7);
		list1.push(8);
		
		list1.deleteNode(3);
		list2.push(1);
		list2.push(23);
		list2.push(2);
		list2.push(21);
		list2.push(7);
		list2.push(8);
		
		list1.show();
		
	}
	
}
