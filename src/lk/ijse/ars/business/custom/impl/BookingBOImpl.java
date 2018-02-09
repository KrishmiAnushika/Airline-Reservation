/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom.impl;

import java.util.List;
import lk.ijse.ars.business.custom.BookingBO;
import lk.ijse.ars.dto.BookingDTO;
import lk.ijse.ars.repository.RepositoryFactory;
import lk.ijse.ars.repository.custom.BookingRepository;


/**
 *
 * @author USER
 */
public class BookingBOImpl implements BookingBO{
    
    private BookingRepository bookingRepository;

    public BookingBOImpl() {
        this.bookingRepository = (BookingRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.BOOKING);
    }

    @Override
    public boolean addBooking(BookingDTO booking) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateBooking(BookingDTO booking) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteBooking(String bookingID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BookingDTO> getAllBookings() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
