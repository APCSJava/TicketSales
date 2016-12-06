
public class Tester {

	public static void main(String[] args) {
		Ticket walk1 = new Walkup();
		Ticket walk2 = new Walkup();
		
		// uncomment the following lines when ready to test
		// the Advance and StudentAdvance classes
		
		//Ticket advance1 = new Advance(9);
		//Ticket advance2 = new Advance(10);
		//Ticket student1 = new StudentAdvance(4);
		//Ticket student2 = new StudentAdvance(12);
		Ticket[] tix = new Ticket[2];
		tix[0] = walk1;
		tix[1] = walk2;
		for (Ticket t:tix) {
			System.out.println(t);
		}
	}

}
