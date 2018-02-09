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
import lk.ijse.ars.business.custom.BookingDetailsBO;
import lk.ijse.ars.dto.BookingDetailsDTO;
import lk.ijse.ars.observer.Subject;
import lk.ijse.ars.reservation.impl.ReservationImpl;
import lk.ijse.ars.service.custom.BookingDetailsService;


/**
 *
 * @author USER
 */
public class BookingDetailsServiceImpl extends UnicastRemoteObject implements BookingDetailsService, Subject {

    private BookingDetailsBO bookingDetailsBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<BookingDetailsService> cusResBook = new ReservationImpl<>();

    public BookingDetailsServiceImpl() throws RemoteException {
        bookingDetailsBO = (BookingDetailsBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.BOOKINGDETAILS);
    }

    @Override
    public boolean addBookingDetails(BookingDetailsDTO bookingDetails) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteBookingDetails(String bookingDetailsID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateBookingDetails(BookingDetailsDTO bookingDetails) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BookingDetailsDTO> getAllBookingDetails() throws Exception {
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
