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
import lk.ijse.ars.business.custom.ClassDetailsBO;
import lk.ijse.ars.dto.ClassDetailsDTO;
import lk.ijse.ars.dto.ClassesDTO;
import lk.ijse.ars.dto.FlightDTO;
import lk.ijse.ars.observer.Observer;
import lk.ijse.ars.observer.Subject;
import lk.ijse.ars.reservation.impl.ReservationImpl;
import lk.ijse.ars.service.custom.ClassDetailsService;


/**
 *
 * @author USER
 */
public class ClassDetailsServiceImpl extends UnicastRemoteObject implements ClassDetailsService, Subject {

    private ClassDetailsBO classDetailsBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<ClassDetailsService> cusResBook = new ReservationImpl<>();

    public ClassDetailsServiceImpl() throws RemoteException {
        classDetailsBO = (ClassDetailsBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CLASSDETAILS);
    }

    @Override
    public boolean addClassDetails(ClassDetailsDTO classDetails,ClassesDTO classes,FlightDTO flight) throws Exception {
        boolean result = classDetailsBO.addClassDetails(classDetails, classes, flight);
        notifyObservers();
        return result;
    }

    @Override
    public boolean deleteClassDetails(String classDetailsID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateClassDetails(ClassDetailsDTO classDetails) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ClassDetailsDTO> getAllClassDetails() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
}
