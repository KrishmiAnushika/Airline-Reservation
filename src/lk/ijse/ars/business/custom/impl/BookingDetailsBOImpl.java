/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom.impl;

import java.util.List;
import lk.ijse.ars.business.custom.BookingDetailsBO;
import lk.ijse.ars.dto.BookingDetailsDTO;
import lk.ijse.ars.repository.RepositoryFactory;
import lk.ijse.ars.repository.custom.BookingDetailsRepository;


/**
 *
 * @author USER
 */
public class BookingDetailsBOImpl implements BookingDetailsBO{
    
    private BookingDetailsRepository bookingDetailsRepository;

    public BookingDetailsBOImpl() {
        this.bookingDetailsRepository = (BookingDetailsRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.BOOKINGDETAILS);
    }

    @Override
    public boolean addBookingDetails(BookingDetailsDTO bookingDetails) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateBookingDetails(BookingDetailsDTO bookingDetails) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteBookingDetails(String bookingDetailsID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BookingDetailsDTO> getAllBookingDetails() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
