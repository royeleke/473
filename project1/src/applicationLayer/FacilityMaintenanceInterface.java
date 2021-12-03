package applicationLayer;

import java.time.LocalDate;
import java.util.List;

import domain.Facility;
import domain.FacilityProblems;
import domain.MaintRequests;
import domain.Maintenance;

public interface FacilityMaintenanceInterface {
	public MaintRequests makeFacilityMaintRequest(int facilityId);
	public Maintenance scheduleMaintenance(int maintenanceId,LocalDate date);
	public Integer calcMaintenanceCostForFacility(int facilityId);
	public Integer calcProblemRateForFacility(int facilityId);
	public Integer calcDownTimeForFacility(int facility);
	public List<MaintRequests> listMaintRequests();
	public List<Maintenance> listMaintenance();
	public List<FacilityProblems> listFacilityProblems();
}
