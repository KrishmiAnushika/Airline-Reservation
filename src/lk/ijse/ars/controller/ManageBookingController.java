/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.controller;

import java.util.List;
import lk.ijse.ars.dto.BookingDTO;
import lk.ijse.ars.observer.Subject;
import lk.ijse.ars.proxy.ProxyHandler;
import lk.ijse.ars.service.ServiceFactory;
import lk.ijse.ars.service.custom.BookingService;

/**
 *
 * @author USER
 */
public class ManageBookingController {
    
    public static boolean addBooking(BookingDTO booking) throws Exception{
        BookingService bookingService = (BookingService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.BOOKING);
        return bookingService.addBooking(booking);
    }
    
    public static boolean updateBooking(BookingDTO booking) throws Exception{
        BookingService bookingService = (BookingService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.BOOKING);
        return bookingService.updateBooking(booking);
    }

    public static boolean deleteBooking(String bookingId) throws Exception{
        BookingService bookingService = (BookingService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.BOOKING);
        return bookingService.deleteBooking(bookingId);
    }    
    
    public static List<BookingDTO> getAllBooking() throws Exception{
        BookingService bookingService = (BookingService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.BOOKING);
        return bookingService.getAllBooking();
    }
    
    public static Subject getSubject() throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.BOOKING);
    }
    
    public static boolean reserveBooking(String bookingID) throws Exception{
        BookingService bookingService = (BookingService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.BOOKING);
        return bookingService.reserve(bookingID);
    }
    
    public static boolean releaseBooking(String bookingID) throws Exception{
        BookingService bookingService = (BookingService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.BOOKING);
        return bookingService.release(bookingID);
    }  
}
