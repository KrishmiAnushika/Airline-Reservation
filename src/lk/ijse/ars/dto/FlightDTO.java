/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.dto;

/**
 *
 * @author USER
 */
public class FlightDTO extends SuperDTO{
   private String flightID;
   private String flightName;
   private String type;
   private String flightNumber;
//   private AirlineDTO airlineDTO;
   private String airlineID;
    
   public FlightDTO() {
    }

    public FlightDTO(String flightID, String flightName, String type, String flightNumber, String airlineID) {
        this.flightID = flightID;
        this.flightName = flightName;
        this.type = type;
        this.flightNumber = flightNumber;
        this.airlineID = airlineID;
    }

    /**
     * @return the flightID
     */
    public String getFlightID() {
        return flightID;
    }

    /**
     * @param flightID the flightID to set
     */
    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    /**
     * @return the flightName
     */
    public String getFlightName() {
        return flightName;
    }

    /**
     * @param flightName the flightName to set
     */
    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the flightNumber
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * @param flightNumber the flightNumber to set
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * @return the airlineID
     */
    public String getAirlineID() {
        return airlineID;
    }

    /**
     * @param airlineID the airlineID to set
     */
    public void setAirlineID(String airlineID) {
        this.airlineID = airlineID;
    }

    
    
    }
