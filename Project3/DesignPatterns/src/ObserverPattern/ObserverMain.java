package ObserverPattern;

public class ObserverMain {
	
	public static void main(String [] args) {
		
		Prison[] prisons = new Prison[] {
				new Prison("New York"), new Prison("Texas"), new Prison("Los Angeles")
			};
			
		WantedList list = new WantedList();
		
		for (Prison prison : prisons) {
			list.addPrison(prison);
		}
		
		list.addWantedMan("Harry");
		
		for (Prison prison : prisons) {
			prison.print();
		}
		
		list.addWantedMan("Alex");
		
		for (Prison prison : prisons) {
			prison.print();
		}
	}
	

}
