/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.controller;

import java.util.List;
import lk.ijse.ars.dto.PaymentDTO;
import lk.ijse.ars.proxy.ProxyHandler;
import lk.ijse.ars.service.ServiceFactory;
import lk.ijse.ars.service.custom.PaymentService;


/**
 *
 * @author USER
 */
public class ManagePaymentController {
   
    public static boolean addPayment(PaymentDTO payment) throws Exception{
        PaymentService paymentService = (PaymentService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.PAYMENT);
        return paymentService.addPayment(payment);
    }
    
    public static boolean updatePayment(PaymentDTO payment) throws Exception{
        PaymentService paymentService = (PaymentService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.PAYMENT);
        return paymentService.addPayment(payment);
    }

    public static boolean deletePayment(String paymentId) throws Exception{
        PaymentService paymentService = (PaymentService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.PAYMENT);
        return paymentService.deletePayment(paymentId);
    }    
    
    public static List<PaymentDTO> getAllPayment() throws Exception{
        PaymentService paymentService = (PaymentService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.PAYMENT);
        return paymentService.getAllPayment();
    }
}
