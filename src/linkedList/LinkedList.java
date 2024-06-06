package linkedList;

public class LinkedList {

	Node head;

	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}

	public boolean add(int data){
		Node node=new Node(data);
		if(head==null) {
			head = node;
			return true;
		}
		Node current = head;
		while(current.next!=null)
			current= current.next;
		current.next=node;
        return false;
    }

	public  void remove(int data){
		if (head==null)
			return;
		if (head.data==data)
			head=head.next;
		Node curr =head;
		while (curr.next!=null){
			if (curr.next.data==data)
				curr.next=curr.next.next;
			curr=curr.next;
		}
	}

	public  void printlist(){
		Node curr=head;
		while (curr!=null){
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}

	Node reverse()
	{	Node node=head;
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.add(10);
		list.add(20);
		list.printlist();
		list.remove(10);
		list.printlist();

	}
}
