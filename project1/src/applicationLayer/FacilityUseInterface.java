package applicationLayer;

import domain.Facility;

public interface FacilityUseInterface {
	public Boolean isInUseDuringInterval(int facilityId);
	public Boolean assignFacilityToUse(Facility facility);
	public Boolean vacateFacility(Facility facility);
	public String listInspections();
	public String listActualUsage();
	public Integer calcUsageRate();
}
