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
public class Shcedule {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int shceduleID;
  private String origin;
  private String destination;
  private String originTakeOffDate;
  private String originTakeOffTime;
  private String destinationTakeOffDate;
  private String destinationTakeOffTime;
  private double tripCost;
  @ManyToOne(cascade = CascadeType.ALL)
//  @JoinColumn(name = "flightID",referencedColumnName = "flightID",insertable = false,updatable = false)
  private Flight flight;

    public Shcedule() {
    }

    public Shcedule(int shceduleID, String origin, String destination, String originTakeOffDate, String originTakeOffTime, String destinationTakeOffDate, String destinationTakeOffTime, double tripCost, Flight flight) {
        this.shceduleID = shceduleID;
        this.origin = origin;
        this.destination = destination;
        this.originTakeOffDate = originTakeOffDate;
        this.originTakeOffTime = originTakeOffTime;
        this.destinationTakeOffDate = destinationTakeOffDate;
        this.destinationTakeOffTime = destinationTakeOffTime;
        this.tripCost = tripCost;
        this.flight = flight;
    }

    /**
     * @return the shceduleID
     */
    public int getShceduleID() {
        return shceduleID;
    }

    /**
     * @param shceduleID the shceduleID to set
     */
    public void setShceduleID(int shceduleID) {
        this.shceduleID = shceduleID;
    }

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the originTakeOffDate
     */
    public String getOriginTakeOffDate() {
        return originTakeOffDate;
    }

    /**
     * @param originTakeOffDate the originTakeOffDate to set
     */
    public void setOriginTakeOffDate(String originTakeOffDate) {
        this.originTakeOffDate = originTakeOffDate;
    }

    /**
     * @return the originTakeOffTime
     */
    public String getOriginTakeOffTime() {
        return originTakeOffTime;
    }

    /**
     * @param originTakeOffTime the originTakeOffTime to set
     */
    public void setOriginTakeOffTime(String originTakeOffTime) {
        this.originTakeOffTime = originTakeOffTime;
    }

    /**
     * @return the destinationTakeOffDate
     */
    public String getDestinationTakeOffDate() {
        return destinationTakeOffDate;
    }

    /**
     * @param destinationTakeOffDate the destinationTakeOffDate to set
     */
    public void setDestinationTakeOffDate(String destinationTakeOffDate) {
        this.destinationTakeOffDate = destinationTakeOffDate;
    }

    /**
     * @return the destinationTakeOffTime
     */
    public String getDestinationTakeOffTime() {
        return destinationTakeOffTime;
    }

    /**
     * @param destinationTakeOffTime the destinationTakeOffTime to set
     */
    public void setDestinationTakeOffTime(String destinationTakeOffTime) {
        this.destinationTakeOffTime = destinationTakeOffTime;
    }

    /**
     * @return the tripCost
     */
    public double getTripCost() {
        return tripCost;
    }

    /**
     * @param tripCost the tripCost to set
     */
    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    /**
     * @return the flight
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * @param flight the flight to set
     */
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Shcedule{" + "shceduleID=" + shceduleID + ", origin=" + origin + ", destination=" + destination + ", originTakeOffDate=" + originTakeOffDate + ", originTakeOffTime=" + originTakeOffTime + ", destinationTakeOffDate=" + destinationTakeOffDate + ", destinationTakeOffTime=" + destinationTakeOffTime + ", tripCost=" + tripCost + ", flight=" + flight + '}';
    }

    
}
