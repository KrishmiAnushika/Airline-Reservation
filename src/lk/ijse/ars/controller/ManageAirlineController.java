///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package lk.ijse.ars.controller;
//
//import java.util.List;
//import lk.ijse.ars.dto.AirlineDTO;
//import lk.ijse.ars.observer.Subject;
//import lk.ijse.ars.proxy.ProxyHandler;
//import lk.ijse.ars.service.ServiceFactory;
//import lk.ijse.ars.service.custom.AirlineService;
//
//
///**
// *
// * @author USER
// */
//public class ManageAirlineController {
//    
//    public static boolean addAirline(AirlineDTO airline) throws Exception{
//        AirlineService airlineService = (AirlineService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.AIRLINE);
//        return airlineService.addAirline(airline);
//    }
//    
//    public static boolean updateAirline(AirlineDTO airline) throws Exception{
//        AirlineService airlineService = (AirlineService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.AIRLINE);
//        return airlineService.addAirline(airline);
//    }
//
//    public static boolean deleteAirline(String airlineId) throws Exception{
//        AirlineService airlineService = (AirlineService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.AIRLINE);
//        return airlineService.deleteAirline(airlineId);
//    }    
//    
//    public static List<AirlineDTO> getAllAirline() throws Exception{
//        AirlineService airlineService = (AirlineService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.AIRLINE);
//        return airlineService.getAllAirline();
//    }
//    
//    public  static AirlineDTO findById(String id) throws Exception{
//        AirlineService airlineService = (AirlineService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.AIRLINE);
//        return airlineService.findById(id);
//    }
//    
//    public static Subject getSubject()throws Exception{
//        return (Subject)ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.AIRLINE);
//    }
//}
