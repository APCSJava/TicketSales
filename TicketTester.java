import java.util.ArrayList;
import java.util.List;

public class TicketTester {

	public static void main(String[] args) {
		List<Ticket> tix = new ArrayList<Ticket>();
		
		tix.add(new Walkup());
		tix.add(new Advance(5));
		tix.add(new Advance(12));
		tix.add(new StudentAdvance(9));
		tix.add(new StudentAdvance(11));
		
		for(Ticket t: tix) {
			System.out.println(t+"\n");
		}
		
	}

}
