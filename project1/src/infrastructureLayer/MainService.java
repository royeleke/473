package infrastructureLayer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import applicationLayer.FacilityInterface;
import applicationLayer.FacilityMaintenanceInterface;
import applicationLayer.FacilityUseInterface;
import domain.Facility;
import domain.FacilityProblems;
import domain.FacilityUsage;
import domain.MaintRequests;
import domain.Maintenance;

public class MainService implements FacilityInterface, FacilityUseInterface, FacilityMaintenanceInterface{
	
	public List<Facility> facilityList= new ArrayList<>();
	public List<Maintenance> maintenanceList= new ArrayList<>();
	public List<FacilityUsage> facilityUsageList= new ArrayList<>();
	public List<MaintRequests> requestsList= new ArrayList<>();
	public List<FacilityProblems> problemsList= new ArrayList<>();
	
	public MainService() {
		fetchDbData();
	}
	
	
	@Override
	public MaintRequests makeFacilityMaintRequest(int facilityId) {
		Facility facility=facilityList.get(facilityId+1);
		int size= requestsList.size();
		MaintRequests request= new MaintRequests(size,"Maintenance required for facility "+facilityId,facility);	
		return request;
	}

	@Override
	public Maintenance scheduleMaintenance(int maintenanceId, LocalDate date) {
		Maintenance maintenance= maintenanceList.get(maintenanceId+1);
		maintenance.setScheduledAt(date);
		return maintenance;
	}

	@Override
	public Integer calcMaintenanceCostForFacility(int facilityId) {
		int cost=0;
		for(Maintenance maintenance:maintenanceList) {
			if(maintenance.getFacility().getId()==facilityId) {
				cost=cost+maintenance.getCost();
			}
		}
		return cost;
	}

	@Override
	public Integer calcProblemRateForFacility(int facilityId) {
		int rate=0;
		for(FacilityProblems problems:problemsList) {
			if(problems.getFacility().getId()==facilityId)
				rate=rate+1;
		}
		return rate;
	}

	@Override
	public Integer calcDownTimeForFacility(int facility) {
		return null;
	}

	@Override
	public List<MaintRequests> listMaintRequests() {
		
		return requestsList;
	}

	@Override
	public List<Maintenance> listMaintenance() {
		return maintenanceList;
	}

	@Override
	public List<FacilityProblems> listFacilityProblems() {
		return problemsList;
	}

	@Override
	public Boolean isInUseDuringInterval(int facilityId) {
		return null;
	}

	@Override
	public Boolean assignFacilityToUse(Facility facility) {
		return null;
	}

	@Override
	public Boolean vacateFacility(Facility facility) {
		return null;
	}

	@Override
	public String listInspections() {
		return null;
	}

	@Override
	public String listActualUsage() {
		return null;
	}

	@Override
	public Integer calcUsageRate() {
		return null;
	}

	@Override
	public List<Facility> listFacilities() {
		return facilityList;
	}

	@Override
	public String getFacilityInformation(int id) {
		return null;
	}

	@Override
	public Integer requestAvailableCapacity(int facilityId) {
		return null;
	}

	@Override
	public Facility addNewFacility() {
		return null;
	}

	@Override
	public Boolean removeFacility(int facilityId) {
		return null;
	}
	///this is demo data iniialized for testing
	public void fetchDbData() {
		facilityList.add(new Facility(1,"Facility 1",15,"active"));
		facilityList.add(new Facility(2,"Facility 2",45,"active"));
		facilityList.add(new Facility(3,"Facility 3",25,"active"));
		facilityList.add(new Facility(4,"Facility 4",35,"active"));
		facilityList.add(new Facility(5,"Facility 5",25,"active"));
		maintenanceList.add(new Maintenance(1, facilityList.get(1),30,"ongoing",LocalDate.now()));
		maintenanceList.add(new Maintenance(2, facilityList.get(2),30,"ongoing",LocalDate.now()));
		maintenanceList.add(new Maintenance(3, facilityList.get(3),30,"ongoing",LocalDate.now()));
		maintenanceList.add(new Maintenance(4, facilityList.get(2),30,"ongoing",LocalDate.now()));
		maintenanceList.add(new Maintenance(5, facilityList.get(3),30,"ongoing",LocalDate.now()));
		facilityUsageList.add(new FacilityUsage(1,facilityList.get(1),10,"in use",5));
		facilityUsageList.add(new FacilityUsage(2,facilityList.get(1),10,"in use",5));
		facilityUsageList.add(new FacilityUsage(3,facilityList.get(2),20,"in use",5));
		facilityUsageList.add(new FacilityUsage(4,facilityList.get(4),10,"in use",25));
		requestsList.add(new MaintRequests(1,"Required Maintenance for facility 2",facilityList.get(1)));
		requestsList.add(new MaintRequests(2,"Required Maintenance for facility 3",facilityList.get(2)));
		requestsList.add(new MaintRequests(3,"Required Maintenance for facility 4",facilityList.get(3)));
		requestsList.add(new MaintRequests(4,"Required Maintenance for facility 5",facilityList.get(4)));
		requestsList.add(new MaintRequests(5,"Required Maintenance for facility 1",facilityList.get(0)));
		problemsList.add(new FacilityProblems(1,"Problem found for facility 1", facilityList.get(0)));
		problemsList.add(new FacilityProblems(2,"Problem found for facility 1", facilityList.get(0)));
		problemsList.add(new FacilityProblems(3,"Problem found for facility 1", facilityList.get(0)));
		problemsList.add(new FacilityProblems(4,"Problem found for facility 3", facilityList.get(2)));
		problemsList.add(new FacilityProblems(5,"Problem found for facility 3", facilityList.get(2)));

	
	}
	

}
