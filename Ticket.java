
public abstract class Ticket {
	
	// because this field is static, it will be initialized
	// with the Ticket.class when that class is loaded by JVM
	private static int counter = 0; //
	
	// the following field is private; all derived classes 
	// will carry the data but will not be able to access it directly
	private int serialNumber;
	
	// because this class is abstract, the constructor below will 
	// not be called directly.  It will, however, be called by  
	// each derived class, as the first line of their constructor!
	public Ticket() {
		serialNumber = getNextSerialNumber();
	}
	
	// returns the price for this ticket
	public abstract double getPrice();
	
	// returns a string with info about the ticket
	public String toString() {
		return "Number: "+serialNumber+"\nPrice: "+getPrice();
	}
	
	// increment and then return our ticket counter
	private static int getNextSerialNumber() {
		counter++;
		return counter;
	}

}
