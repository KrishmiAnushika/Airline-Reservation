/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.service.custom;

import java.util.List;
import lk.ijse.ars.dto.BookingDTO;
import lk.ijse.ars.service.SuperService;

/**
 *
 * @author USER
 */
public interface BookingService extends SuperService{
    
    public boolean addBooking(BookingDTO booking) throws Exception;
    public boolean deleteBooking(String bookingID) throws Exception;
    public boolean updateBooking(BookingDTO booking) throws Exception;
    public List<BookingDTO>getAllBooking() throws Exception;
    
}
