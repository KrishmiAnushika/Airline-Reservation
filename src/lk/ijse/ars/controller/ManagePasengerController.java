/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.controller;

import java.util.List;
import lk.ijse.ars.dto.PasengerDTO;
import lk.ijse.ars.proxy.ProxyHandler;
import lk.ijse.ars.service.ServiceFactory;
import lk.ijse.ars.service.custom.PasengerService;


/**
 *
 * @author USER
 */
public class ManagePasengerController {
 
    public static boolean addPasenger(PasengerDTO pasenger) throws Exception{
        PasengerService pasengerService = (PasengerService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.PASENGER);
        return pasengerService.addPasenger(pasenger);
    }
    
    public static boolean updatePasenger(PasengerDTO pasenger) throws Exception{
        PasengerService pasengerService = (PasengerService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.PASENGER);
        return pasengerService.addPasenger(pasenger);
    }

    public static boolean deletePasenger(String pasengerId) throws Exception{
        PasengerService pasengerService = (PasengerService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.PASENGER);
        return pasengerService.deletePasenger(pasengerId);
    }    
    
    public static List<PasengerDTO> getAllPasenger() throws Exception{
        PasengerService pasengerService = (PasengerService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.PASENGER);
        return pasengerService.getAllPasenger();
    }
}
