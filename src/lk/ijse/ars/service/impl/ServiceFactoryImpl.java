/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lk.ijse.ars.service.ServiceFactory;
import lk.ijse.ars.service.SuperService;
//import lk.ijse.ars.service.custom.impl.AirlineServiceImpl;
import lk.ijse.ars.service.custom.impl.AirportServiceImpl;
import lk.ijse.ars.service.custom.impl.BookingDetailsServiceImpl;
import lk.ijse.ars.service.custom.impl.BookingServiceImpl;
import lk.ijse.ars.service.custom.impl.ClassDetailsServiceImpl;
import lk.ijse.ars.service.custom.impl.ClassesServiceImpl;
import lk.ijse.ars.service.custom.impl.FlightServiceImpl;
import lk.ijse.ars.service.custom.impl.PasengerServiceImpl;
import lk.ijse.ars.service.custom.impl.PaymentServiceImpl;
import lk.ijse.ars.service.custom.impl.ShceduleServiceImpl;

/**
 *
 * @author USER
 */
public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory{
    
    public static ServiceFactory serviceFactory;
    
    private ServiceFactoryImpl() throws RemoteException{
        
    }

    public static ServiceFactory getInstance() throws RemoteException{
        if (serviceFactory == null){
            serviceFactory = new ServiceFactoryImpl();
        }
        return serviceFactory;
    }

    @Override
    public SuperService getService(ServiceTypes type) throws Exception {
        switch(type){
            case PASENGER:
                return new PasengerServiceImpl();
            case PAYMENT:
                return new PaymentServiceImpl();
//            case AIRLINE:
//                return new AirlineServiceImpl();
            case CLASSES:
                return new ClassesServiceImpl();
            case AIRPORT:
                return new AirportServiceImpl();
            case FLIGHT:
                return new FlightServiceImpl();
            case BOOKING:
                return new BookingServiceImpl();
            case BOOKINGDETAILS:
                return new BookingDetailsServiceImpl();
            case CLASSDETAILS:
                return new ClassDetailsServiceImpl();
            case SHCEDULE:
                return new ShceduleServiceImpl();
            default:
                return null;
        }
    }
}
