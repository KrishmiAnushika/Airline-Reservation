/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author USER
 */
@Entity
public class Payment {
 @Id
    private String paymentID;
    private double amount;
    private String date;

    public Payment() {
    }

    public Payment(String paymentID, double amount, String date) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.date = date;
    }

    /**
     * @return the paymentID
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * @param paymentID the paymentID to set
     */
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
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

    @Override
    public String toString() {
        return "Payment{" + "paymentID=" + paymentID + ", amount=" + amount + ", date=" + date + '}';
    }

    }
