package domain;

public class FacilityUsage {
	private int id;
	private Facility facility;
	private int cost;
	private String status;
	private int capacityUsed;
	
	public FacilityUsage() {}
	
	public FacilityUsage(int id, Facility facility, int cost, String status, int capacityUsed) {
		super();
		this.id = id;
		this.facility = facility;
		this.cost = cost;
		this.status = status;
		this.capacityUsed = capacityUsed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Facility getFacility() {
		return facility;
	}
	public void setFacility(Facility facility) {
		this.facility = facility;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCapacityUsed() {
		return capacityUsed;
	}
	public void setCapacityUsed(int capacityUsed) {
		this.capacityUsed = capacityUsed;
	}

	@Override
	public String toString() {
		return "FacilityUsage [id=" + id + ", facility=" + facility + ", cost=" + cost + ", status=" + status
				+ ", capacityUsed=" + capacityUsed + "]";
	}
	
	
	
}
