package day18;

public class Node {
	
		private int seatNo;	//10 20 int  Alice Ben  String
		private String passName;
		private int passAge;
		
		private Node next;
		
		public Node(int seatNo,String passName,int passAge)
		{
			this.seatNo=seatNo;
			this.passName=passName;
			this.passAge=passAge;
			this.next=null;
		}

		public int getSeatNo() {
			return seatNo;
		}

		public void setSeatNo(int seatNo) {
			this.seatNo = seatNo;
		}

		public String getPassName() {
			return passName;
		}

		public void setPassName(String passName) {
			this.passName = passName;
		}

		public int getPassAge() {
			return passAge;
		}

		public void setPassAge(int passAge) {
			this.passAge = passAge;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

				
		
}
