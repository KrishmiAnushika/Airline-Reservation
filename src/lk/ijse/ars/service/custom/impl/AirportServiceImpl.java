/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.service.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.ars.business.BOFactory;
import lk.ijse.ars.business.custom.AirportBO;
import lk.ijse.ars.dto.AirportDTO;
import lk.ijse.ars.observer.Observer;
import lk.ijse.ars.observer.Subject;
import lk.ijse.ars.reservation.impl.ReservationImpl;
import lk.ijse.ars.service.custom.AirportService;


/**
 *
 * @author USER
 */
public class AirportServiceImpl extends UnicastRemoteObject implements AirportService, Subject {

    private AirportBO airportBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<AirportService> cusResBook = new ReservationImpl<>();

    public AirportServiceImpl() throws RemoteException {
        airportBO = (AirportBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.AIRPORT);
    }

    @Override
    public boolean addAirport(AirportDTO airport) throws Exception {
        boolean result = airportBO.addAirport(airport);
        notifyObservers();
        return result;
    }

    @Override
    public boolean deleteAirport(String airportID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateAirport(AirportDTO airport) throws Exception {
        boolean result = false;
        if (cusResBook.reserve(airport.getAirportID(), this, true)) {
            result = airportBO.updateAirport(airport);
            notifyObservers();
            if (cusResBook.isInternalReservation(airport.getAirportID())){
                release(airport.getAirportID());
            }            
        }
        return result;
    }

    @Override
    public List<AirportDTO> getAllAirport() throws Exception {
        return airportBO.getAllAirports();
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean release(Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registerObserver(lk.ijse.ars.observer.Observer observer) throws Exception {
        alObservers.add(observer);
    }

    @Override
    public void unregisterObserver(lk.ijse.ars.observer.Observer observer) throws Exception {
        alObservers.remove(observer);
    }

    @Override
    public void notifyObservers() throws Exception {
        new Thread(() -> {
            for (Observer observer : alObservers) {
                try {
                    observer.updateObservers();
                } catch (Exception ex) {
                    Logger.getLogger(AirportServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }
}
