
public class Advance extends Ticket {

	private int numDays;
	
	public Advance(int numDays) {
		this.numDays = numDays;
	}
	
	@Override
	public double getPrice() {
		if (numDays >= 10) return 30.0;
		return 40.0;
	}

	
}
