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
public class AirportDTO extends SuperDTO{
    
   private String airportID;
   private String airportName;
   private String country;

    public AirportDTO() {
    }

    public AirportDTO(String airportID, String airportName, String country) {
        this.airportID = airportID;
        this.airportName = airportName;
        this.country = country;
    }

    /**
     * @return the airportID
     */
    public String getAirportID() {
        return airportID;
    }

    /**
     * @param airportID the airportID to set
     */
    public void setAirportID(String airportID) {
        this.airportID = airportID;
    }

    /**
     * @return the airportName
     */
    public String getAirportName() {
        return airportName;
    }

    /**
     * @param airportName the airportName to set
     */
    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
}
