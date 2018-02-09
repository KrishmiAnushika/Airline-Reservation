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
import lk.ijse.ars.business.custom.ClassesBO;
import lk.ijse.ars.dto.ClassesDTO;
import lk.ijse.ars.observer.Observer;
import lk.ijse.ars.observer.Subject;
import lk.ijse.ars.reservation.impl.ReservationImpl;
import lk.ijse.ars.service.custom.ClassesService;


/**
 *
 * @author USER
 */
public class ClassesServiceImpl extends UnicastRemoteObject implements ClassesService, Subject {

    private ClassesBO classesBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<ClassesService> cusResBook = new ReservationImpl<>();

    public ClassesServiceImpl() throws RemoteException {
        classesBO = (ClassesBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CLASSES);
    }

    @Override
    public boolean addClass(ClassesDTO classDTO) throws Exception {
        boolean result = classesBO.addClasses(classDTO);
        notifyObservers();
        return result;
    }

    @Override
    public boolean deleteClass(String classID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateClass(ClassesDTO classDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ClassesDTO> getAllClass() throws Exception {
        return classesBO.getAllClass();
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

    @Override
    public ClassesDTO findById(String id) throws Exception {
        return classesBO.findById(id);
    }
}
