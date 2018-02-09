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
public class BookingDTO extends SuperDTO{
    private String bookingID;
    private String date;
    private String time;
    private FlightDTO flightDTO;
    

    public BookingDTO() {
    }

    public BookingDTO(String bookingID, String date, String time, FlightDTO flightDTO) {
        this.bookingID = bookingID;
        this.date = date;
        this.time = time;
        this.flightDTO = flightDTO;
    }

    /**
     * @return the bookingID
     */
    public String getBookingID() {
        return bookingID;
    }

    /**
     * @param bookingID the bookingID to set
     */
    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
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