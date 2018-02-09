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
public class ClassDetails_PKDTO extends SuperDTO{
   private String classID;
   private String flightID;

    public ClassDetails_PKDTO() {
    }

    public ClassDetails_PKDTO(String classID, String flightID) {
        this.classID = classID;
        this.flightID = flightID;
    }
   
}
