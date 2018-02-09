/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author USER
 */
@Embeddable
public class BookingDetails_PK implements Serializable{
    @Column(length = 5)
    private String pasengerID;
    @Column(length = 5)
    private String bookingID;
    @Column(length = 5)
    private String paymentID;
    public BookingDetails_PK() {
    }

    public BookingDetails_PK(String pasengerID, String bookingID, String paymentID) {
        this.pasengerID = pasengerID;
        this.bookingID = bookingID;
        this.paymentID = paymentID;
    }

    
    
}
