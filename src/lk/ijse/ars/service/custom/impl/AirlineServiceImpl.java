///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package lk.ijse.ars.service.custom.impl;
//
//import java.rmi.RemoteException;
//import java.rmi.server.UnicastRemoteObject;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import lk.ijse.ars.business.BOFactory;
//import lk.ijse.ars.business.custom.AirlineBO;
//import lk.ijse.ars.dto.AirlineDTO;
//import lk.ijse.ars.observer.Observer;
//import lk.ijse.ars.observer.Subject;
//import lk.ijse.ars.reservation.impl.ReservationImpl;
//import lk.ijse.ars.service.custom.AirlineService;
//
//
///**
// *
// * @author USER
// */
//public class AirlineServiceImpl extends UnicastRemoteObject implements AirlineService, Subject {
//
//    private AirlineBO airlineBO;
//    private static ArrayList<Observer> alObservers = new ArrayList<>();
//    private static ReservationImpl<AirlineService> cusResBook = new ReservationImpl<>();
//
//    public AirlineServiceImpl() throws RemoteException {
//        airlineBO = (AirlineBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.AIRLINE);
//    }
//
//    @Override
//    public boolean addAirline(AirlineDTO airline) throws Exception {
//        boolean result = airlineBO.addAirline(airline);
//        notifyObservers();
//        return result;
//    }
//
//    @Override
//    public boolean deleteAirline(String airlineID) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean updateAirline(AirlineDTO airline) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public List<AirlineDTO> getAllAirline() throws Exception {
//        return airlineBO.getAllAirlines();
//    }
//
//    @Override
//    public boolean reserve(Object id) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean release(Object id) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void registerObserver(lk.ijse.ars.observer.Observer observer) throws Exception {
//        alObservers.add(observer);
//    }
//
//    @Override
//    public void unregisterObserver(lk.ijse.ars.observer.Observer observer) throws Exception {
//        alObservers.remove(observer);
//    }
//
//    @Override
//    public void notifyObservers() throws Exception {
//        new Thread(() -> {
//            for (Observer observer : alObservers) {
//                try {
//                    observer.updateObservers();
//                } catch (Exception ex) {
//                    Logger.getLogger(AirlineServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }).start();
//    }
//
//    @Override
//    public AirlineDTO findById(String id) throws Exception {
//        return airlineBO.findById(id);
//    }
//}
