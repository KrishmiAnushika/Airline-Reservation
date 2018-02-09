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
public class ClassDetails_PK implements Serializable{
    @Column(length = 5)
    private String classID;
    @Column(length = 5)
    private String flightID;

    public ClassDetails_PK() {
    }

    public ClassDetails_PK(String classID, String flightID) {
        this.classID = classID;
        this.flightID = flightID;
    }
    
    
}
