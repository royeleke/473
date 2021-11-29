package domain;

public class MaintRequests {
	private int id;
	private String description;
	private Facility facility;
	
	public MaintRequests() {}
	
	public MaintRequests(int id, String description, Facility facility) {
		super();
		this.id = id;
		this.description = description;
		this.facility = facility;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Facility getFacility() {
		return facility;
	}
	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	@Override
	public String toString() {
		return "MaintRequests [id=" + id + ", description=" + description + ", facility=" + facility + "]";
	}
	
	
	
}
