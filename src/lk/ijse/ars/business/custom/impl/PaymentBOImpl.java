/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom.impl;

import java.util.List;
import lk.ijse.ars.business.custom.PaymentBO;
import lk.ijse.ars.dto.PaymentDTO;
import lk.ijse.ars.repository.RepositoryFactory;
import lk.ijse.ars.repository.custom.PaymentRepository;


/**
 *
 * @author USER
 */
public class PaymentBOImpl implements PaymentBO{
    
    private PaymentRepository paymentRepository;

    public PaymentBOImpl() {
        this.paymentRepository = (PaymentRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.PAYMENT);
    }

    @Override
    public boolean addPayment(PaymentDTO payment) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updatePayment(PaymentDTO payment) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletePayment(String paymentID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PaymentDTO> getAllPayments() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}