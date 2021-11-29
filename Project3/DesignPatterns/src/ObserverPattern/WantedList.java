package ObserverPattern;

import java.util.LinkedList;

public class WantedList {
	
	LinkedList <String> list;
	LinkedList <Prison> prisons;
	
	public WantedList() { list = new LinkedList <String> (); prisons = new LinkedList <Prison> (); }
	
	public void addPrison(Prison prison) {
		prisons.add(prison);
	}
	
	public void removePrison(Prison prison) {
		prisons.remove(prison);
	}
	
	public void addWantedMan(String name) {
		list.add(name);
		for (Prison prison : prisons) {
			prison.update(list);
		}
	}

}
