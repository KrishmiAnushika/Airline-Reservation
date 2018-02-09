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
public class BookingDetailsDTO extends SuperDTO{
   private String bookingDetailsID;
   private String origin;
   private String destination;
   private String depatureDate;
   private String returnDate;
   private String bookingClass;
   private String bookingSeatNo;
   private String seatCount;
   private double tripCost;
   private PaymentDTO paymentDTO;
   private PasengerDTO pasengerDTO;
   private BookingDTO bookingDTO;

    public BookingDetailsDTO() {
    }

    public BookingDetailsDTO(String bookingDetailsID, String origin, String destination, String depatureDate, String returnDate, String bookingClass, String bookingSeatNo, String seatCount, double tripCost, PaymentDTO paymentDTO, PasengerDTO pasengerDTO, BookingDTO bookingDTO) {
        this.bookingDetailsID = bookingDetailsID;
        this.origin = origin;
        this.destination = destination;
        this.depatureDate = depatureDate;
        this.returnDate = returnDate;
        this.bookingClass = bookingClass;
        this.bookingSeatNo = bookingSeatNo;
        this.seatCount = seatCount;
        this.tripCost = tripCost;
        this.paymentDTO = paymentDTO;
        this.pasengerDTO = pasengerDTO;
        this.bookingDTO = bookingDTO;
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
     * @return the paymentDTO
     */
    public PaymentDTO getPaymentDTO() {
        return paymentDTO;
    }

    /**
     * @param paymentDTO the paymentDTO to set
     */
    public void setPaymentDTO(PaymentDTO paymentDTO) {
        this.paymentDTO = paymentDTO;
    }

    /**
     * @return the pasengerDTO
     */
    public PasengerDTO getPasengerDTO() {
        return pasengerDTO;
    }

    /**
     * @param pasengerDTO the pasengerDTO to set
     */
    public void setPasengerDTO(PasengerDTO pasengerDTO) {
        this.pasengerDTO = pasengerDTO;
    }

    /**
     * @return the bookingDTO
     */
    public BookingDTO getBookingDTO() {
        return bookingDTO;
    }

    /**
     * @param bookingDTO the bookingDTO to set
     */
    public void setBookingDTO(BookingDTO bookingDTO) {
        this.bookingDTO = bookingDTO;
    }

    
}
