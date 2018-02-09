/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom;

import java.util.List;
import lk.ijse.ars.business.SuperBO;
import lk.ijse.ars.dto.PaymentDTO;


/**
 *
 * @author USER
 */
public interface PaymentBO extends SuperBO{
    
    public boolean addPayment(PaymentDTO payment) throws Exception;
    
    public boolean updatePayment(PaymentDTO payment) throws Exception;
    
    public boolean deletePayment(String paymentID) throws Exception;
    
    public List<PaymentDTO> getAllPayments() throws Exception;
    
}
