package ObserverPattern;

import java.util.LinkedList;

public class Prison {
	
	LinkedList <String> wantedPeople;
	String name;
	
	Prison(String name) {
		wantedPeople = new LinkedList <String> ();
		this.name = name;
	}
	
	public void update(LinkedList <String> people) {
		wantedPeople = people;
	}
	
	public void print() {
		System.out.println("Prison name: " + name);
		for (String criminal: wantedPeople) {
			System.out.println(criminal);
		}
	}

}
