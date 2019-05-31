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
	
	 void insertNode(int d){
		Node temp = head;
		if(head == null){
			
			head = new Node(d);
			return;
		}
		Node new_Node = new Node(d);
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = new_Node;
		new_Node.next = null;
	}
	void show(){
		if(head == null){
			return;
		}
		Node temp = head;
		while(temp.next!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
			System.out.println(temp.data);
	}
	public void deleteNode(int pos){
		int k=0;
		Node temp = head;
		Node temp1 = temp;
		if(head == null){
			return;
		}
		if(pos == 0){
			head = temp.next;
			temp = null;
			return;
		}
		while(temp.next!=null){
			
			if(k == pos){
				temp1.next = temp.next;
			
				temp = null;
				return;
			}
			temp1 = temp;
			temp = temp.next;
			k++;
			
		}
		if(k == pos){
				temp1.next = temp.next;
				temp = null;
				return;
			}
	}
	public void deleteList(){
		
		head = null;
	}
	public void lengthList(){
		Node temp = head;
		int k=0;
		while(temp!=null){
			temp = temp.next;
			k++;
		}
		System.out.println("Length of list "+k);
		
	}
	public static void main(String args[]){
		
		LinkedList list1 = new LinkedList();
			LinkedList list2 = new LinkedList();
		list1.insertNode(2);
		list1.insertNode(3);
		list1.insertNode(4);
		list2.insertNode(7);
		list2.insertNode(59);
		list2.insertNode(9);
		list1.deleteNode(0);		//at given position
		list1.lengthList();

		list2.deleteList();
		list2.show();
		
	}
	
}
