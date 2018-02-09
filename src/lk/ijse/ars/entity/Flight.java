/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author USER
 */
@Entity
public class Flight {
  @Id
//  @GeneratedValue(strategy = GenerationType.AUTO)
  private String flightID;
  private String flightName;
  private String number;
  private String type;
  private String airlineID;

  
  
  
//  @ManyToOne(cascade = CascadeType.ALL)
//  //@JoinColumn(name="airlineID",referencedColumnName = "airlineID",insertable = false,updatable = false)
//  private Airline airline;

    public Flight() {
    }

    public Flight(String flightID, String flightName, String number, String type, String airlineID) {
        this.flightID = flightID;
        this.flightName = flightName;
        this.number = number;
        this.type = type;
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
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
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

    @Override
    public String toString() {
        return "Flight{" + "flightID=" + flightID + ", flightName=" + flightName + ", number=" + number + ", type=" + type + ", airlineID=" + airlineID + '}';
    }

    
    }
