/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.service.custom;

import java.util.List;
import lk.ijse.ars.dto.PaymentDTO;
import lk.ijse.ars.service.SuperService;

/**
 *
 * @author USER
 */
public interface PaymentService extends SuperService{
     
    public boolean addPayment(PaymentDTO payment) throws Exception;
    public boolean deletePayment(String paymentID) throws Exception;
    public boolean updatePayment(PaymentDTO payment) throws Exception;
    public List<PaymentDTO>getAllPayment() throws Exception;
    
}
