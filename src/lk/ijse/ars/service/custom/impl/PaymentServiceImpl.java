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
import java.util.Observer;
import lk.ijse.ars.business.BOFactory;
import lk.ijse.ars.business.custom.PaymentBO;
import lk.ijse.ars.dto.PaymentDTO;
import lk.ijse.ars.observer.Subject;
import lk.ijse.ars.reservation.impl.ReservationImpl;
import lk.ijse.ars.service.custom.PaymentService;


/**
 *
 * @author USER
 */
public class PaymentServiceImpl extends UnicastRemoteObject implements PaymentService, Subject {

    private PaymentBO paymentBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<PaymentService> cusResBook = new ReservationImpl<>();

    public PaymentServiceImpl() throws RemoteException {
        paymentBO = (PaymentBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.PAYMENT);
    }

    @Override
    public boolean addPayment(PaymentDTO payment) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletePayment(String paymentID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updatePayment(PaymentDTO payment) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PaymentDTO> getAllPayment() throws Exception {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unregisterObserver(lk.ijse.ars.observer.Observer observer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObservers() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
