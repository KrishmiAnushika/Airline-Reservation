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
import lk.ijse.ars.business.custom.ShceduleBO;
import lk.ijse.ars.dto.FlightDTO;
import lk.ijse.ars.dto.ShceduleDTO;
import lk.ijse.ars.observer.Observer;
import lk.ijse.ars.observer.Subject;
import lk.ijse.ars.reservation.impl.ReservationImpl;
import lk.ijse.ars.service.custom.ShceduleService;


/**
 *
 * @author USER
 */
public class ShceduleServiceImpl extends UnicastRemoteObject implements ShceduleService, Subject {

    private ShceduleBO shceduleBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<ShceduleService> cusResBook = new ReservationImpl<>();

    public ShceduleServiceImpl() throws RemoteException {
        shceduleBO = (ShceduleBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.SHCEDULE);
    }

    @Override
    public boolean addShcedule(ShceduleDTO shcedule, FlightDTO flight) throws Exception {
        boolean result = shceduleBO.addShcedule(shcedule,flight);
        notifyObservers();
        return result;
    }

    @Override
    public boolean deleteShcedule(String shceduleID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateShcedule(ShceduleDTO shcedule) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ShceduleDTO> getAllShcedule() throws Exception {
        return shceduleBO.getAllShcedules();
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
                    Logger.getLogger(AirlineServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }
}
