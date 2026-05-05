package day14;

public class DynamicStack {

	private Node top=null;
	
	public void push(int data) {
		Node nn=new Node(data);
		if(top==null)
		{
			top=nn;
		}
		else
		{
			nn.setNext(top);
			top=nn;
		}
			
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
