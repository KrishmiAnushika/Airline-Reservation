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
public class Pasenger {
  @Id
  private String pasengerID;
  private String pasengerName;
  private String passportNO;
  private String address;
  private String contactNO;
  private String gender;
  private String age;

    public Pasenger() {
    }

    public Pasenger(String pasengerID, String pasengerName, String passportNO, String address, String contactNO, String gender, String age) {
        this.pasengerID = pasengerID;
        this.pasengerName = pasengerName;
        this.passportNO = passportNO;
        this.address = address;
        this.contactNO = contactNO;
        this.gender = gender;
        this.age = age;
    }

    /**
     * @return the pasengerID
     */
    public String getPasengerID() {
        return pasengerID;
    }

    /**
     * @param pasengerID the pasengerID to set
     */
    public void setPasengerID(String pasengerID) {
        this.pasengerID = pasengerID;
    }

    /**
     * @return the pasengerName
     */
    public String getPasengerName() {
        return pasengerName;
    }

    /**
     * @param pasengerName the pasengerName to set
     */
    public void setPasengerName(String pasengerName) {
        this.pasengerName = pasengerName;
    }

    /**
     * @return the passportNO
     */
    public String getPassportNO() {
        return passportNO;
    }

    /**
     * @param passportNO the passportNO to set
     */
    public void setPassportNO(String passportNO) {
        this.passportNO = passportNO;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contactNO
     */
    public String getContactNO() {
        return contactNO;
    }

    /**
     * @param contactNO the contactNO to set
     */
    public void setContactNO(String contactNO) {
        this.contactNO = contactNO;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pasenger{" + "pasengerID=" + pasengerID + ", pasengerName=" + pasengerName + ", passportNO=" + passportNO + ", address=" + address + ", contactNO=" + contactNO + ", gender=" + gender + ", age=" + age + '}';
    }
  
}
