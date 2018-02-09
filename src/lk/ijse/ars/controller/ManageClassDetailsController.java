/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.controller;

import java.util.List;
import lk.ijse.ars.dto.ClassDetailsDTO;
import lk.ijse.ars.dto.ClassesDTO;
import lk.ijse.ars.dto.FlightDTO;
import lk.ijse.ars.observer.Subject;
import lk.ijse.ars.proxy.ProxyHandler;
import lk.ijse.ars.service.ServiceFactory;
import lk.ijse.ars.service.custom.ClassDetailsService;


/**
 *
 * @author USER
 */
public class ManageClassDetailsController {
    
    public static boolean addClassDetails(ClassDetailsDTO classDetails,ClassesDTO classes,FlightDTO flight) throws Exception{
        ClassDetailsService classDetailsService = (ClassDetailsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CLASSDETAILS);
        return classDetailsService.addClassDetails(classDetails, classes, flight);
    }
    
    public static boolean updateClassDetails(ClassDetailsDTO classDetails) throws Exception{
        ClassDetailsService classDetailsService = (ClassDetailsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CLASSDETAILS);
        return classDetailsService.updateClassDetails(classDetails);
    }

    public static boolean deleteClassDetails(String classDetailsId) throws Exception{
        ClassDetailsService classDetailsService = (ClassDetailsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CLASSDETAILS);
        return classDetailsService.deleteClassDetails(classDetailsId);
    }    
    
    public static List<ClassDetailsDTO> getAllClassDetails() throws Exception{
        ClassDetailsService classDetailsService = (ClassDetailsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CLASSDETAILS);
        return classDetailsService.getAllClassDetails();
    }
    public static Subject getSubject() throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CLASSDETAILS);
    }
    
    public static boolean reserveClassDetails(String classDetailsID) throws Exception{
        ClassDetailsService classDetailsService = (ClassDetailsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CLASSDETAILS);
        return classDetailsService.reserve(classDetailsID);
    }
    
    public static boolean releaseClassDetails(String classDetailsID) throws Exception{
        ClassDetailsService classDetailsService = (ClassDetailsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CLASSDETAILS);
        return classDetailsService.release(classDetailsID);
    }
}
