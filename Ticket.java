
public abstract class Ticket {
	
	private int serialNumber; // unique
	
	public Ticket() {
		serialNumber = getNextSerialNumber();
	}
	
	public abstract double getPrice();
	
	public String toString() {
		return "Number: "+serialNumber+"\nPrice: "+getPrice();
	}
	
	private static int startingTicket = 0;
	private static int getNextSerialNumber() {
		return startingTicket++;
	}

}
