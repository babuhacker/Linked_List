class LinkedList{
	Node head ;
	 class Node{
		int data;
		Node next;
		Node(int d){
			
			data = d;
			next = null;
			
			
		}
		
	}
	
	public void add(int data){
		
		
		if(head == null){
			
			head  =  new Node(data);
		
			return;
			
		}
		Node new_Node = new Node(data);
		Node temp = head;
		
		while(temp.next!= null){
			temp= temp.next;
		}
	
		temp.next  = new_Node;
		return;
		
	}
	
	public void show(){
		
		Node temp = head;
		while(temp.next!=null){
			
			System.out.println(temp.data);
			temp= temp.next;
		}
		System.out.println(temp.data);
		
	}
	
	public void reverse(){
	  Node prev = null; 
        Node current = head; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev; 
        return; 
		
	}
	
	public static void main(String args[]){
		
		LinkedList list1 = new LinkedList();
		
		
		list1.add(12);
		list1.add(12);
		list1.add(16);
		list1.add(62);
		list1.add(16);
		list1.add(52);
		list1.reverse();
		list1.show();
		
		
	}
	
	
}
