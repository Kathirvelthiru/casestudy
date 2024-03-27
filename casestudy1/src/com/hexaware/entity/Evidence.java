package com.hexaware.entity;
/**
 * Represents evidence related to an incident.
 */
public class Evidence {
 private int EvidenceID; 
 private String Description;
 private String LocationFound;
 private int IncidentID; 

 /**
  * Constructs an evidence object with the specified attributes.
  * @param evidenceID The ID of the evidence.
  * @param description The description of the evidence.
  * @param locationFound The location where the evidence was found.
  * @param incidentID The ID of the incident associated with the evidence.
  */
 public Evidence(int EvidenceID, String Description, String LocationFound, int IncidentID) {
     this.EvidenceID = EvidenceID;
     this.Description = Description;
     this.LocationFound = LocationFound;
     this.IncidentID = IncidentID;
 }
 /**
  * Gets the ID of the evidence.
  * @return The ID of the evidence.
  */
 public int getEvidenceID() {
     return EvidenceID;
 }
 /**
  * Sets the ID of the evidence.
  * @param evidenceID The ID of the evidence to set.
  */
 public void setEvidenceID(int EvidenceID) {
     this.EvidenceID = EvidenceID;
 }

 public String getDescription() {
     return Description;
 }
 /**
  * Gets the description of the evidence.
  * @return The description of the evidence.
  */
 public void setDescription(String Description) {
     this.Description = Description;
 }
 /**
  * Gets the location where the evidence was found.
  * @return The location where the evidence was found.
  */
 public String getLocationFound() {
     return LocationFound;
 }
 /**
  * Sets the location where the evidence was found.
  * @param locationFound The location where the evidence was found to set.
  */
 public void setLocationFound(String LocationFound) {
     this.LocationFound = LocationFound;
 }
 /**
  * Gets the ID of the incident associated with the evidence.
  * @return The ID of the incident associated with the evidence.
  */

 public int getIncidentID() {
     return IncidentID;
 }
 /**
  * Sets the ID of the incident associated with the evidence.
  * @param incidentID The ID of the incident associated with the evidence to set.
  */
 public void setIncidentID(int IncidentID) {
     this.IncidentID = IncidentID;
 }

 /**
  * Returns a string representation of the evidence.
  * @return A string representation of the evidence.
  */
 @Override
 public String toString() {
     return "Evidence{" +
             "EvidenceID=" + EvidenceID +
             ", Description='" + Description + '\'' +
             ", LocationFound='" + LocationFound + '\'' +
             ", IncidentID=" + IncidentID +
             '}';
 }
}
