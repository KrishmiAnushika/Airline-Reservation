/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.repository;

import lk.ijse.ars.repository.custom.impl.AirlineRepositoryImpl;
import lk.ijse.ars.repository.custom.impl.AirportRepositoryImpl;
import lk.ijse.ars.repository.custom.impl.BookingDetailsRepositoryImpl;
import lk.ijse.ars.repository.custom.impl.BookingRepositoryImpl;
import lk.ijse.ars.repository.custom.impl.ClassDetailsRepositoryImpl;
import lk.ijse.ars.repository.custom.impl.ClassesRepositoryImpl;
import lk.ijse.ars.repository.custom.impl.FlightRepositoryImpl;
import lk.ijse.ars.repository.custom.impl.PasengerRepositoryImpl;
import lk.ijse.ars.repository.custom.impl.PaymentRepositoryImpl;
import lk.ijse.ars.repository.custom.impl.ShceduleRepositoryImpl;

/**
 *
 * @author USER
 */
public class RepositoryFactory {
    public enum RepositoryTypes{
        PASENGER,PAYMENT,AIRLINE,CLASSES,AIRPORT,FLIGHT,BOOKING,BOOKINGDETAILS,CLASSDETAILS,SHCEDULE
    }
    
    public static RepositoryFactory repositoryFactory;
    
    private RepositoryFactory(){
        
    }
    
    public static RepositoryFactory getInstance(){
        if (repositoryFactory == null){
            repositoryFactory = new RepositoryFactory();
        }
        return repositoryFactory;
    }
    
    public SuperRepository getRepository(RepositoryTypes type){
        switch (type){
            case PASENGER:
                return new PasengerRepositoryImpl();
            case PAYMENT:
                return new PaymentRepositoryImpl();
            case AIRLINE:
                return new AirlineRepositoryImpl();
            case CLASSES:
                return new ClassesRepositoryImpl();
            case AIRPORT:
                return new AirportRepositoryImpl();
            case FLIGHT:
                return new FlightRepositoryImpl();
            case BOOKING:
                return new BookingRepositoryImpl();
            case BOOKINGDETAILS:
                return new BookingDetailsRepositoryImpl();
            case CLASSDETAILS:
                return new ClassDetailsRepositoryImpl();
            case SHCEDULE:
                return new ShceduleRepositoryImpl();
            default:
                return null;
        }
    }
}
