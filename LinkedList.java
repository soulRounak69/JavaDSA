class LinkedList
{
	Node head;
	static class Node
	{
	       int data;
	       Node next;
	       Node(int data)
	      {
		this.data=data;
		next=null;
	      }
	}
	public static LinkedList insertAfter(LinkedList list,int d)
	{
		Node newNode=new Node(d);
		if(list.head==null)
		{
			list.head=newNode;
		}
		else
		{
			Node temp=list.head;
			if(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}
		return list;
	}
	public static LinkedList insertBefore(LinkedList list,int d)
	{
		Node newNode=new Node(d);
		if(list.head==null)
		{
			list.head=newNode;
		}
		else
		{
			newNode.next=list.head;
			list.head=newNode;
		}
		return list;
	}
	public static void display(LinkedList list)
	{
		if(list.head==null)
		{
			System.out.println("Empty List ");
		}
		else
		{
			Node temp=list.head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			
		}
	}
	public static LinkedList delHead(LinkedList list)
	{
		if(list.head==list)
		{
			list.head=null;
			
		}
	}
	public static void main(String args[])
	{
		LinkedList ll = new LinkedList();
		ll=ll.insertAfter(ll,4);
		ll=ll.insertAfter(ll,5);
		ll=ll.insertBefore(ll,1);
		ll=ll.insertBefore(ll,2);
		display(ll);
	}
	

}