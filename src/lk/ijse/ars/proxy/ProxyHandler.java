/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.ars.service.ServiceFactory;
import lk.ijse.ars.service.SuperService;
//import lk.ijse.ars.service.custom.AirlineService;
import lk.ijse.ars.service.custom.AirportService;
import lk.ijse.ars.service.custom.BookingDetailsService;
import lk.ijse.ars.service.custom.BookingService;
import lk.ijse.ars.service.custom.ClassDetailsService;
import lk.ijse.ars.service.custom.ClassesService;
import lk.ijse.ars.service.custom.FlightService;
import lk.ijse.ars.service.custom.PasengerService;
import lk.ijse.ars.service.custom.PaymentService;
import lk.ijse.ars.service.custom.ShceduleService;

/**
 *
 * @author USER
 */
public class ProxyHandler implements ServiceFactory {

    private static ProxyHandler proxyHandler;
    private ServiceFactory serviceFactory;
    private PasengerService pasengerService;
    private PaymentService paymentService;
//    private AirlineService airlineService;
    private ClassesService classesService;
    private AirportService airportService;
    private FlightService flightService;
    private BookingService bookingService;
    private BookingDetailsService bookingDetailsService;
    private ClassDetailsService classDetailsService;
    private ShceduleService shceduleService;

    private ProxyHandler() {
        try {
            serviceFactory = (ServiceFactory) Naming.lookup("rmi://localhost:5050/airgo");
            pasengerService = (PasengerService) serviceFactory.getService(ServiceTypes.PASENGER);
            paymentService = (PaymentService) serviceFactory.getService(ServiceTypes.PAYMENT);
//            airlineService = (AirlineService) serviceFactory.getService(ServiceTypes.AIRLINE);
            classesService = (ClassesService) serviceFactory.getService(ServiceTypes.CLASSES);
            airportService = (AirportService) serviceFactory.getService(ServiceTypes.AIRPORT);
            flightService = (FlightService) serviceFactory.getService(ServiceTypes.FLIGHT);
            bookingService = (BookingService) serviceFactory.getService(ServiceTypes.BOOKING);
            bookingDetailsService = (BookingDetailsService) serviceFactory.getService(ServiceTypes.BOOKINGDETAILS);
            classDetailsService = (ClassDetailsService) serviceFactory.getService(ServiceTypes.CLASSDETAILS);
            shceduleService = (ShceduleService) serviceFactory.getService(ServiceTypes.SHCEDULE);

        } catch (NotBoundException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ProxyHandler getInstance() {
        if (proxyHandler == null) {
            proxyHandler = new ProxyHandler();
        }
        return proxyHandler;
    }

    @Override
    public SuperService getService(ServiceTypes type) throws Exception {
        switch (type) {
            case PASENGER:
                return pasengerService;
            case PAYMENT:
                return paymentService;
//            case AIRLINE:
//                return airlineService;
            case CLASSES:
                return classesService;
            case AIRPORT:
                return airportService;
            case FLIGHT:
                return flightService;
            case BOOKING:
                return bookingService;
            case BOOKINGDETAILS:
                return bookingDetailsService;
            case CLASSDETAILS:
                return classDetailsService;
            case SHCEDULE:
                return shceduleService;
            default:
                return null;
        }
    }
}
