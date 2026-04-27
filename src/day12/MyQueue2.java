package day12;

public class MyQueue2 {
	
	int queue[]=new int[5];
	int rear=-1;
	int front=0;
	
	void insert(int data)
	{
			rear++;
			queue[rear]=data;
	}
		

	int remove()
	{	
		int data=queue[front];		
		front++;
		return data;
	}
	
	void display()
	{
			for(int i=front;i<=rear;i++)
				System.out.println(queue[i]);
	}
	
	public boolean isEmpty()
	{
		if(front>rear)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(rear==queue.length-1)
			return true;
		else
			return false;
	}
	
	public int peek()
	{
		return queue[front];
	}

}
