package day19;

public class Passenger {
	private int seatNo;	//10 20 int  Alice Ben  String
	private String passName;
	private int passAge;
	
	public Passenger() {}
	public Passenger(int seatNo, String passName, int passAge) {
		this.seatNo = seatNo;
		this.passName = passName;
		this.passAge = passAge;
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
	
	@Override
	public String toString() {
		return "Passenger [seatNo=" + seatNo + ", passName=" + passName + ", passAge=" + passAge + "]";
	}
	
	
	
	
}
