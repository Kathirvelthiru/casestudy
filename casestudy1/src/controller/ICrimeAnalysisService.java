
package controller;
import java.util.Collection;
import java.util.List;

import com.hexaware.entity.Incidents;
import com.hexaware.entity.Reports;
/**
 * Interface for crime analysis service.
 * Defines methods for managing incidents and generating incident reports.
 */
public interface ICrimeAnalysisService {
	 /**
     * Adds an incident.
     * @param incident The incident to add.
     */
	public void addIncident(Incidents incident);
	/**
     * Removes an incident.
     * @param incident The incident to remove.
     */
	public void removePet(Incidents incident);
	/**
     * Lists available incidents.
     */
	public void listAvailable();
	/**
     * Searches for incidents.
     * @return A collection of incidents.
     */
	public Collection<Incidents> searchIncidents();
	/**
     * Generates incident reports for a given incident.
     * @param incident The incident for which reports are generated.
     * @return A list of reports.
     */
	public static List<Reports> generateIncidentReport(Incidents incident) {
		// TODO Auto-generated method stub
		return null;
	}	

}