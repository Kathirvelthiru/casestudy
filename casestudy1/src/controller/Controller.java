

package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.hexaware.dao.Dao;
import com.hexaware.entity.Incidents;
import com.hexaware.entity.Reports;
/**
 * Abstract controller class implementing the ICrimeAnalysisService interface.
 * Provides methods to manage incidents and generate incident reports.
 */
public abstract class Controller<IncidentID> implements ICrimeAnalysisService  {
	private List<Incidents> availableIncidents;
	private Object connection;
	/**
     * Constructs a Controller object.
     * Initializes the list of available incidents.
     */
	public Controller() {
        availableIncidents = new ArrayList<>();
    }

	/**
     * Adds an incident to the list of available incidents.
     * @param incident The incident to be added.
     */
	public void addIncidents(Incidents incident) {
		// TODO Auto-generated method stub
	        availableIncidents.add(incident);
	        System.out.println(" added to the list of available incidents: " + incident.toString());
	    }

	 /**
     * Removes an incident from the list of available incidents.
     * @param incident The incident to be removed.
     */
	public void removeIncidents(Incidents incident) {
		// TODO Auto-generated method stub
		availableIncidents.remove(incident);
        System.out.println(" removed from the list of available incidents: " + incident.toString());
    }
	
	/**
     * Lists all available incidents.
     */
	
	public void listAvailable() {
		// TODO Auto-generated method stub
		
		if (availableIncidents.isEmpty()) {
            System.out.println("No incidents found.");
        } else {
            System.out.println("Available incidents:");
            for (Incidents incident : availableIncidents) {
                System.out.println(incident);
            }
        }
		
	}
	/**
     * Searches for an incident by its ID.
     * @param incidentID The ID of the incident to search for.
     * @return The incident if found, otherwise null.
     */
	public Incidents searchIncidentByID(int incidentID) {
        try {
            return Dao.searchIncidentByID(incidentID);
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
            return null;
        }
    }
	/**
     * Generates incident reports for a given incident.
     * @param incident The incident for which reports are generated.
     */
	public void generateIncidentReport(Incidents incident) {
        List<Reports> reports = ICrimeAnalysisService.generateIncidentReport(incident);
        if (reports.isEmpty()) {
            System.out.println("No reports found for the incident.");
        } else {
            System.out.println("Incident Reports:");
            for (Reports report : reports) {
                System.out.println(report); // Assuming Report class has a suitable toString() method
            }
        }
    }

	@Override
	public void addIncident(Incidents incident) {
		// TODO Auto-generated method stub
		
	}

	


	
	

}