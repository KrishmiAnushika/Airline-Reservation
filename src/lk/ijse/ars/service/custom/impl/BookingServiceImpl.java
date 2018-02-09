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
import lk.ijse.ars.business.custom.BookingBO;
import lk.ijse.ars.dto.BookingDTO;
import lk.ijse.ars.observer.Subject;
import lk.ijse.ars.reservation.impl.ReservationImpl;
import lk.ijse.ars.service.custom.BookingService;


/**
 *
 * @author USER
 */
public class BookingServiceImpl extends UnicastRemoteObject implements BookingService, Subject {

    private BookingBO bookingBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<BookingService> cusResBook = new ReservationImpl<>();

    public BookingServiceImpl() throws RemoteException {
        bookingBO = (BookingBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.BOOKING);
    }

    @Override
    public boolean addBooking(BookingDTO booking) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteBooking(String bookingID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateBooking(BookingDTO booking) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BookingDTO> getAllBooking() throws Exception {
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
