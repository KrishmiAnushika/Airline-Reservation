/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.service;

import java.rmi.Remote;

/**
 *
 * @author USER
 */
public interface ServiceFactory extends Remote{
  
    public enum ServiceTypes{
        PASENGER,PAYMENT,CLASSES,AIRPORT,FLIGHT,BOOKING,BOOKINGDETAILS,CLASSDETAILS,SHCEDULE
    }
    
    public SuperService getService(ServiceTypes type) throws Exception;
    
}
