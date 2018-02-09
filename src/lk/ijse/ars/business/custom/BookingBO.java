/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom;

import java.util.List;
import lk.ijse.ars.business.SuperBO;
import lk.ijse.ars.dto.BookingDTO;


/**
 *
 * @author USER
 */
public interface BookingBO extends SuperBO{
    
    public boolean addBooking(BookingDTO booking) throws Exception;
    
    public boolean updateBooking(BookingDTO booking) throws Exception;
    
    public boolean deleteBooking(String bookingID) throws Exception;
    
    public List<BookingDTO> getAllBookings() throws Exception;
    
}
