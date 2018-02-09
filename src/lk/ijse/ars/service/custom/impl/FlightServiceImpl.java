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
import lk.ijse.ars.business.custom.FlightBO;
//import lk.ijse.ars.dto.AirlineDTO;
import lk.ijse.ars.dto.FlightDTO;
import lk.ijse.ars.observer.Observer;
import lk.ijse.ars.observer.Subject;
import lk.ijse.ars.reservation.impl.ReservationImpl;
import lk.ijse.ars.service.custom.FlightService;


/**
 *
 * @author USER
 */
public class FlightServiceImpl extends UnicastRemoteObject implements FlightService, Subject {

    private FlightBO flightBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<FlightService> cusResBook = new ReservationImpl<>();

    public FlightServiceImpl() throws RemoteException {
        flightBO = (FlightBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.FLIGHT);
    }

    @Override
    public boolean addFlight(FlightDTO flight) throws Exception {
        boolean result = flightBO.addFlight(flight);
        notifyObservers();
        return result;
    }

    @Override
    public boolean deleteFlight(String flightID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateFlight(FlightDTO flight) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FlightDTO> getAllFlight() throws Exception {
        return flightBO.getAllFlight();
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
    public void registerObserver(Observer observer) throws Exception {
        alObservers.add(observer);
    }

    @Override
    public void unregisterObserver(lk.ijse.ars.observer.Observer observer) throws Exception {
        alObservers.remove(observer);
    }

    @Override
    public void notifyObservers() throws Exception {
        new Thread(()->{
            for (Observer observer : alObservers) {
                try {
                    observer.updateObservers();
                } catch (Exception e) {
                    Logger.getLogger(FlightServiceImpl.class.getName()).log(Level.SEVERE, null,e);
                }
 
            }
        }).start();
    }

    @Override
    public FlightDTO findById(String id) throws Exception {
       return flightBO.findById(id);
    }

    @Override
    public FlightDTO searchByName(String name) throws Exception {
        return flightBO.searchByName(name);
    }
}
