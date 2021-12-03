package domain;

import java.time.LocalDate;

public class Maintenance {
	private int id;
	private Facility facility;
	private int cost;
	private String status;
	private LocalDate scheduledAt;
	
	public Maintenance() {}
	
	public Maintenance(int id, Facility facility, int cost, String status, LocalDate scheduledAt) {
		super();
		this.id = id;
		this.facility = facility;
		this.cost = cost;
		this.status = status;
		this.scheduledAt = scheduledAt;
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
	public LocalDate getScheduledAt() {
		return scheduledAt;
	}
	public void setScheduledAt(LocalDate scheduledAt) {
		this.scheduledAt = scheduledAt;
	}

	@Override
	public String toString() {
		return "Maintenance [id=" + id + ", facility=" + facility + ", cost=" + cost + ", status=" + status
				+ ", scheduledAt=" + scheduledAt + "]";
	}
	
}
