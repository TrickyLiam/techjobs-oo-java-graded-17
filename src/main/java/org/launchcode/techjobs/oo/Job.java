package org.launchcode.techjobs.oo;

import javax.naming.Name;
import java.util.Collections;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        if(id == 0){
            return "Data Not Available";
        }
       String newline = System.lineSeparator();
        return
                        newline +
                        "ID: " + this.getId() + newline +
                        "Name: " + this.getName() + newline +
                        "Employer: " + this.getEmployer() + newline +
                        "Location: " + this.getLocation() + newline +
                        "Position Type: " + this.getPositionType() + newline +
                        "Core Competency: " + this.getCoreCompetency() + newline;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getName() {
        if(this.name == null) {
            return "Data not available";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PositionType getPositionType() {
        if(this.positionType.getValue() == null || this.positionType.getValue().isEmpty()) {
            return new PositionType("Data not available");
        }
        return positionType;
    }

    public Location getLocation() {
        if(this.location.getValue() == null || this.location.getValue().isEmpty()) {
            return new Location("Data not available");
        }
        return location;
    }

    public CoreCompetency getCoreCompetency() {
        if(this.coreCompetency.getValue() == null || this.coreCompetency.getValue().isEmpty()) {
            return new CoreCompetency("Data not available");
        }
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public Employer getEmployer() {
        if(this.employer.getValue() == null || this.employer.getValue().isEmpty()) {
            return new Employer("Data not available");
        }
        return employer;
    }

    public int getId() {
        return id;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
// TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
