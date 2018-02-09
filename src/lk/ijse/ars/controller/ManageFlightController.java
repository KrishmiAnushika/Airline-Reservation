/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.controller;

import java.util.List;
//import lk.ijse.ars.dto.AirlineDTO;
import lk.ijse.ars.dto.FlightDTO;
import lk.ijse.ars.observer.Subject;
import lk.ijse.ars.proxy.ProxyHandler;
import lk.ijse.ars.service.ServiceFactory;
import lk.ijse.ars.service.custom.FlightService;


/**
 *
 * @author USER
 */
public class ManageFlightController {
  
    public static boolean addFlight(FlightDTO flight) throws Exception{
        FlightService flightService = (FlightService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.FLIGHT);
        return flightService.addFlight(flight);
    }
    
    public static boolean updateFlight(FlightDTO flight) throws Exception{
        FlightService flightService = (FlightService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.FLIGHT);
        return flightService.updateFlight(flight);
    }

    public static boolean deleteFlight(String flightId) throws Exception{
        FlightService flightService = (FlightService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.FLIGHT);
        return flightService.deleteFlight(flightId);
    }    
    
    public static List<FlightDTO> getAllFlight() throws Exception{
        FlightService flightService = (FlightService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.FLIGHT);
        return flightService.getAllFlight();
    }
    
    public  static FlightDTO findById(String id) throws Exception{
        FlightService flightService = (FlightService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.FLIGHT);
        return flightService.findById(id);
    }
    
    public  static FlightDTO findByName(String name) throws Exception{
        FlightService flightService = (FlightService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.FLIGHT);
        return flightService.searchByName(name);
    }

    public static Subject getSubject()throws Exception{
        return (Subject)ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.FLIGHT);
    }
}
