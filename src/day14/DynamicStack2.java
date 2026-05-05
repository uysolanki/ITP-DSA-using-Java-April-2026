package day14;

public class DynamicStack2 {

	private Node top=null;
	
	public void push(int data) {
		Node nn=new Node(data);
		if(top!=null)					//1st iteration false   2nd iteration true
			nn.setNext(top);
		
			top=nn;		
	}

	
	public int pop() {
		int data=top.getData();
		top=top.getNext();
		return data;
	}
	
	public void display() {
			Node temp=top;
			while(temp!=null)
			{
				System.out.println(temp.getData());
				temp=temp.getNext();
			}
	}
	
	public boolean isEmpty()
	{
		if(top==null)
		return true;
		else
		return false;
	}
	

}
