/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.controller;

import java.util.List;
import lk.ijse.ars.dto.FlightDTO;
import lk.ijse.ars.dto.ShceduleDTO;
import lk.ijse.ars.observer.Subject;
import lk.ijse.ars.proxy.ProxyHandler;
import lk.ijse.ars.service.ServiceFactory;
import lk.ijse.ars.service.custom.ShceduleService;


/**
 *
 * @author USER
 */
public class ManageShceduleController {
    
    public static boolean addShcedule(ShceduleDTO shcedule, FlightDTO flight) throws Exception{
        ShceduleService shceduleService = (ShceduleService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SHCEDULE);
        return shceduleService.addShcedule(shcedule,flight);
    }
    
    public static boolean updateShcedule(ShceduleDTO shcedule) throws Exception{
        ShceduleService shceduleService = (ShceduleService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SHCEDULE);
        return shceduleService.updateShcedule(shcedule);
    }

    public static boolean deleteShcedule(String shceduleId) throws Exception{
        ShceduleService shceduleService = (ShceduleService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SHCEDULE);
        return shceduleService.deleteShcedule(shceduleId);
    }    
    
    public static List<ShceduleDTO> getAllShcedule() throws Exception{
        ShceduleService shceduleService = (ShceduleService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SHCEDULE);
        return shceduleService.getAllShcedule();
    }
                   
    public static Subject getSubject()throws Exception{
        return (Subject)ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SHCEDULE);
    }
}
