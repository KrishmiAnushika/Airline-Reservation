/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.entity;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author USER
 */
@Entity
public class ClassDetails {
 
 private String windowSeatCount;
 private String normalSeatCount;
// private String noOfSeat;
 private double classFee;
 @ManyToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "flightID",referencedColumnName = "flightID",insertable = false,updatable = false)
  private Flight flight;
 @ManyToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "classID",referencedColumnName = "classID",insertable = false,updatable = false)
  private Classes classes;
 @EmbeddedId
 private ClassDetails_PK classDetails_PK;

    public ClassDetails() {
    }

    public ClassDetails(String windowSeatCount, String normalSeatCount, double classFee, Flight flight, Classes classes, ClassDetails_PK classDetails_PK) {
        this.windowSeatCount = windowSeatCount;
        this.normalSeatCount = normalSeatCount;
        this.classFee = classFee;
        this.flight = flight;
        this.classes = classes;
        this.classDetails_PK = classDetails_PK;
    }

    /**
     * @return the windowSeatCount
     */
    public String getWindowSeatCount() {
        return windowSeatCount;
    }

    /**
     * @param windowSeatCount the windowSeatCount to set
     */
    public void setWindowSeatCount(String windowSeatCount) {
        this.windowSeatCount = windowSeatCount;
    }

    /**
     * @return the normalSeatCount
     */
    public String getNormalSeatCount() {
        return normalSeatCount;
    }

    /**
     * @param normalSeatCount the normalSeatCount to set
     */
    public void setNormalSeatCount(String normalSeatCount) {
        this.normalSeatCount = normalSeatCount;
    }

    /**
     * @return the classFee
     */
    public double getClassFee() {
        return classFee;
    }

    /**
     * @param classFee the classFee to set
     */
    public void setClassFee(double classFee) {
        this.classFee = classFee;
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

    /**
     * @return the classes
     */
    public Classes getClasses() {
        return classes;
    }

    /**
     * @param classes the classes to set
     */
    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    /**
     * @return the classDetails_PK
     */
    public ClassDetails_PK getClassDetails_PK() {
        return classDetails_PK;
    }

    /**
     * @param classDetails_PK the classDetails_PK to set
     */
    public void setClassDetails_PK(ClassDetails_PK classDetails_PK) {
        this.classDetails_PK = classDetails_PK;
    }

    @Override
    public String toString() {
        return "ClassDetails{" + "windowSeatCount=" + windowSeatCount + ", normalSeatCount=" + normalSeatCount + ", classFee=" + classFee + ", flight=" + flight + ", classes=" + classes + ", classDetails_PK=" + classDetails_PK + '}';
    }

    
    
}
