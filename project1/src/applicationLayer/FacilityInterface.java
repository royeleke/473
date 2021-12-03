package applicationLayer;

import java.util.List;

import domain.Facility;

public interface FacilityInterface {
	public List<Facility> listFacilities();
	public String getFacilityInformation(int id);
	public Integer requestAvailableCapacity(int facilityId);
	public Facility addNewFacility();
	public Boolean removeFacility(int facilityId);
}
