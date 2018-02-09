/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.service.custom;

import java.util.List;
import lk.ijse.ars.dto.BookingDetailsDTO;
import lk.ijse.ars.service.SuperService;

/**
 *
 * @author USER
 */
public interface BookingDetailsService extends SuperService{
    
    public boolean addBookingDetails(BookingDetailsDTO bookingDetails) throws Exception;
    public boolean deleteBookingDetails(String bookingDetailsID) throws Exception;
    public boolean updateBookingDetails(BookingDetailsDTO bookingDetails) throws Exception;
    public List<BookingDetailsDTO>getAllBookingDetails() throws Exception;
}
