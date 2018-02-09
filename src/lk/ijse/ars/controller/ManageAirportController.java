/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.controller;

import java.util.List;
import lk.ijse.ars.dto.AirportDTO;
import lk.ijse.ars.observer.Subject;
import lk.ijse.ars.proxy.ProxyHandler;
import lk.ijse.ars.service.ServiceFactory;
import lk.ijse.ars.service.custom.AirportService;

/**
 *
 * @author USER
 */
public class ManageAirportController {
    public static boolean addAirport(AirportDTO airport) throws Exception{
        AirportService airportService = (AirportService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.AIRPORT);
       return airportService.addAirport(airport);
    }
    
    public static boolean updateAirport(AirportDTO airport) throws Exception{
        AirportService airportService = (AirportService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.AIRPORT);
        return airportService.addAirport(airport);
    }

    public static boolean deleteAirport(String airportId) throws Exception{
        AirportService airportService = (AirportService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.AIRPORT);
        return airportService.deleteAirport(airportId);
    }    
    
    public static List<AirportDTO> getAllAirports() throws Exception{
       AirportService airportService = (AirportService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.AIRPORT);
        return airportService.getAllAirport();
    }
    
    public static Subject getSubject()throws Exception{
        return (Subject)ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.AIRPORT);
    }
}
