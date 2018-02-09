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

/**
 *
 * @author USER
 */
@Entity
public class BookingDetails {
    private String bookingDetailsID;
    private String origin;
    private String destination;
    private String depatureDate;
    private String returnDate;
    private String bookingClass;
    private String bookingSeatNo;
    private String seatCount;
    private double tripCost;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pasengerID",referencedColumnName = "pasengerID",insertable = false,updatable = false)
    private Pasenger pasenger;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bookingID",referencedColumnName = "bookingID",insertable = false,updatable = false)
    private Booking booking;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymentID",referencedColumnName = "paymentID",insertable = false,updatable = false)
    private Payment payment;
    @EmbeddedId
    private BookingDetails_PK bookingDetails_PK;

    public BookingDetails() {
    }

    public BookingDetails(String bookingDetailsID, String origin, String destination, String depatureDate, String returnDate, String bookingClass, String bookingSeatNo, String seatCount, double tripCost, Pasenger pasenger, Booking booking, BookingDetails_PK bookingDetails_PK) {
        this.bookingDetailsID = bookingDetailsID;
        this.origin = origin;
        this.destination = destination;
        this.depatureDate = depatureDate;
        this.returnDate = returnDate;
        this.bookingClass = bookingClass;
        this.bookingSeatNo = bookingSeatNo;
        this.seatCount = seatCount;
        this.tripCost = tripCost;
        this.pasenger = pasenger;
        this.booking = booking;
        this.bookingDetails_PK = bookingDetails_PK;
    }

    /**
     * @return the bookingDetailsID
     */
    public String getBookingDetailsID() {
        return bookingDetailsID;
    }

    /**
     * @param bookingDetailsID the bookingDetailsID to set
     */
    public void setBookingDetailsID(String bookingDetailsID) {
        this.bookingDetailsID = bookingDetailsID;
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
     * @return the depatureDate
     */
    public String getDepatureDate() {
        return depatureDate;
    }

    /**
     * @param depatureDate the depatureDate to set
     */
    public void setDepatureDate(String depatureDate) {
        this.depatureDate = depatureDate;
    }

    /**
     * @return the returnDate
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * @param returnDate the returnDate to set
     */
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * @return the bookingClass
     */
    public String getBookingClass() {
        return bookingClass;
    }

    /**
     * @param bookingClass the bookingClass to set
     */
    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    /**
     * @return the bookingSeatNo
     */
    public String getBookingSeatNo() {
        return bookingSeatNo;
    }

    /**
     * @param bookingSeatNo the bookingSeatNo to set
     */
    public void setBookingSeatNo(String bookingSeatNo) {
        this.bookingSeatNo = bookingSeatNo;
    }

    /**
     * @return the seatCount
     */
    public String getSeatCount() {
        return seatCount;
    }

    /**
     * @param seatCount the seatCount to set
     */
    public void setSeatCount(String seatCount) {
        this.seatCount = seatCount;
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
     * @return the pasenger
     */
    public Pasenger getPasenger() {
        return pasenger;
    }

    /**
     * @param pasenger the pasenger to set
     */
    public void setPasenger(Pasenger pasenger) {
        this.pasenger = pasenger;
    }

    /**
     * @return the booking
     */
    public Booking getBooking() {
        return booking;
    }

    /**
     * @param booking the booking to set
     */
    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    /**
     * @return the bookingDetails_PK
     */
    public BookingDetails_PK getBookingDetails_PK() {
        return bookingDetails_PK;
    }

    /**
     * @param bookingDetails_PK the bookingDetails_PK to set
     */
    public void setBookingDetails_PK(BookingDetails_PK bookingDetails_PK) {
        this.bookingDetails_PK = bookingDetails_PK;
    }

    @Override
    public String toString() {
        return "BookingDetails{" + "bookingDetailsID=" + bookingDetailsID + ", origin=" + origin + ", destination=" + destination + ", depatureDate=" + depatureDate + ", returnDate=" + returnDate + ", bookingClass=" + bookingClass + ", bookingSeatNo=" + bookingSeatNo + ", seatCount=" + seatCount + ", tripCost=" + tripCost + ", pasenger=" + pasenger + ", booking=" + booking + ", bookingDetails_PK=" + bookingDetails_PK + '}';
    }
    
}
