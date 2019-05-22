
//linked list (insertion a node)
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
		public void push(int data){
			Node temp = head;
			head = new Node(data);
			head.next = temp;
		}
		public void insertAfter(int afterNode,int insertNode){
			Node temp = head;
			while(temp.next!=null || temp.data!=afterNode){
				
				temp = temp.next;
				
			}
			
			Node newNode = new Node(insertNode);
			newNode.next = temp.next;
			temp.next = newNode;
			
		}
		public void append(int data){
			Node temp = head;
			if(head==null){
				head = new Node(data);
				return;
			}
			while(temp.next != null){
				temp = temp.next;
			}
			
			Node newNode = new Node(data);
			temp.next = newNode;
			newNode.next = null;
		}
		public void show(){
			
			Node temp = head;
			while(temp.next !=null){
				System.out.println(temp.data);
				
				temp=temp.next;
				
			}
			System.out.println(temp.data);
			
		}
		public static void main(String args[]){
			LinkedList list1= new LinkedList();
			
			list1.append(6);
			list1.append(61);
			list1.append(12);
			
			list1.show();
			
		}
}
