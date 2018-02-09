/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.controller;

import java.util.List;
import lk.ijse.ars.dto.BookingDetailsDTO;
import lk.ijse.ars.observer.Subject;
import lk.ijse.ars.proxy.ProxyHandler;
import lk.ijse.ars.service.ServiceFactory;
import lk.ijse.ars.service.custom.BookingDetailsService;


/**
 *
 * @author USER
 */
public class ManageBookingDetailsController {
    
    public static boolean addBookingDetails(BookingDetailsDTO bookingDetails) throws Exception{
        BookingDetailsService bookingDetailsService = (BookingDetailsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.BOOKINGDETAILS);
        return bookingDetailsService.addBookingDetails(bookingDetails);
    }
    
    public static boolean updateBookingDetails(BookingDetailsDTO bookingDetails) throws Exception{
        BookingDetailsService bookingDetailsService = (BookingDetailsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.BOOKINGDETAILS);
        return bookingDetailsService.updateBookingDetails(bookingDetails);
    }

    public static boolean deleteBookingDetails(String bookingDetailsId) throws Exception{
        BookingDetailsService bookingDetailsService = (BookingDetailsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.BOOKINGDETAILS);
        return bookingDetailsService.deleteBookingDetails(bookingDetailsId);
    }    
    
    public static List<BookingDetailsDTO> getAllBookingDetails() throws Exception{
        BookingDetailsService bookingDetailsService = (BookingDetailsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.BOOKINGDETAILS);
        return bookingDetailsService.getAllBookingDetails();
    }
    
    public static Subject getSubject() throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.BOOKINGDETAILS);
    }
    
    public static boolean reserveBookingDetails(String bookingDetailsID) throws Exception{
        BookingDetailsService bookingDetailsService = (BookingDetailsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.BOOKINGDETAILS);
        return bookingDetailsService.reserve(bookingDetailsID);
    }
    
    public static boolean releaseBookingDetails(String bookingDetailsID) throws Exception{
        BookingDetailsService bookingDetailsService = (BookingDetailsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.BOOKINGDETAILS);
        return bookingDetailsService.release(bookingDetailsID);
    }
}
