/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom;

import java.util.List;
import lk.ijse.ars.business.SuperBO;
import lk.ijse.ars.dto.BookingDetailsDTO;


/**
 *
 * @author USER
 */
public interface BookingDetailsBO extends SuperBO{
    
    public boolean addBookingDetails(BookingDetailsDTO bookingDetails) throws Exception;
    
    public boolean updateBookingDetails(BookingDetailsDTO bookingDetails) throws Exception;
    
    public boolean deleteBookingDetails(String bookingDetailsID) throws Exception;
    
    public List<BookingDetailsDTO> getAllBookingDetails() throws Exception;
    
}
