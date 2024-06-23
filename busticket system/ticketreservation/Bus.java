package ticketreservation;

public class Bus {
	private int busno;
	private boolean ac;
	private int capacity;//get and set methods
	Bus(int no,boolean ac,int cap){
		this.busno=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getbusno(){//accessoor method
		return busno;
	}
	public int getcapacity(){//accessoor method
		return capacity;
	}
	public void setcapacity(int cap) {//mutator
		capacity=cap;
	}
	public boolean isAc() {
		return ac;
	}
	public void setac(boolean val) {
		ac=val;
	}
	
}
