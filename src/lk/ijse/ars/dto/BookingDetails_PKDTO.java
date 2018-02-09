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
public class BookingDetails_PKDTO extends SuperDTO{
  private String pasengerID;
  private String bookingID;

    public BookingDetails_PKDTO() {
    }

    public BookingDetails_PKDTO(String pasengerID, String bookingID) {
        this.pasengerID = pasengerID;
        this.bookingID = bookingID;
    }
  
}
