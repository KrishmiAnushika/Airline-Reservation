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
public class ShceduleDTO extends SuperDTO{
  private int shceduleID;
  private String origin;
  private String destination;
  private String originTakeOffDate;
  private String originTakeOffTime;
  private String destinationTakeOffDate;
  private String destinationTakeOffTime;
  private double tripCost;
  private FlightDTO flightDTO;
//  private String flightID;

    public ShceduleDTO() {
    }

    public ShceduleDTO(int shceduleID, String origin, String destination, String originTakeOffDate, String originTakeOffTime, String destinationTakeOffDate, String destinationTakeOffTime, double tripCost, FlightDTO flightDTO) {
        this.shceduleID = shceduleID;
        this.origin = origin;
        this.destination = destination;
        this.originTakeOffDate = originTakeOffDate;
        this.originTakeOffTime = originTakeOffTime;
        this.destinationTakeOffDate = destinationTakeOffDate;
        this.destinationTakeOffTime = destinationTakeOffTime;
        this.tripCost = tripCost;
        this.flightDTO = flightDTO;
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
     * @return the flightDTO
     */
    public FlightDTO getFlightDTO() {
        return flightDTO;
    }

    /**
     * @param flightDTO the flightDTO to set
     */
    public void setFlightDTO(FlightDTO flightDTO) {
        this.flightDTO = flightDTO;
    }

    
}
