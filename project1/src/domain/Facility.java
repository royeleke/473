package domain;

public class Facility {
	private int id;
	private String description;
	private int capacity;
	private String status;
	
	public Facility() {}
	
	public Facility(int id, String description, int capacity, String status) {
		this.id = id;
		this.description = description;
		this.capacity = capacity;
		this.status = status;
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
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Facility [id=" + id + ", description=" + description + ", capacity=" + capacity + ", status=" + status
				+ "]";
	}
	
	
}
