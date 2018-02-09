/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.entity;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author USER
 */
@Entity
public class Booking {
  @Id
  private String bookingID;
  private String date;
  private String time;
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "flightID",referencedColumnName = "flightID",insertable = false,updatable = false)
  private Flight flight;
//  @OneToOne(cascade = CascadeType.ALL)
//  @JoinColumn(name = "paymentID",referencedColumnName = "paymentID",insertable = false,updatable = false)
//  private Payment payment;

    public Booking() {
    }

    public Booking(String bookingID, String date, String time, Flight flight) {
        this.bookingID = bookingID;
        this.date = date;
        this.time = time;
        this.flight = flight;
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
        return "Booking{" + "bookingID=" + bookingID + ", date=" + date + ", time=" + time + ", flight=" + flight + '}';
    }

    
  
}