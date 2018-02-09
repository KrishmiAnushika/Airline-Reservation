/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.controller;

import java.util.List;
import lk.ijse.ars.dto.ClassesDTO;
import lk.ijse.ars.observer.Subject;
import lk.ijse.ars.proxy.ProxyHandler;
import lk.ijse.ars.service.ServiceFactory;
import lk.ijse.ars.service.custom.ClassesService;


/**
 *
 * @author USER
 */
public class ManageClassesController {
    
    public static boolean addClasses(ClassesDTO classes) throws Exception{
        ClassesService classesService = (ClassesService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CLASSES);
        return classesService.addClass(classes);
    }
    
    public static boolean updateClasses(ClassesDTO classes) throws Exception{
        ClassesService classesService = (ClassesService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CLASSES);
        return classesService.updateClass(classes);
    }

    public static boolean deleteClasses(String classId) throws Exception{
        ClassesService classesService = (ClassesService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CLASSES);
        return classesService.deleteClass(classId);
    }    
    
    public static List<ClassesDTO> getAllClasses() throws Exception{
        ClassesService classesService = (ClassesService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CLASSES);
        return classesService.getAllClass();
    }
    
    public  static ClassesDTO findById(String id) throws Exception{
        ClassesService classesService = (ClassesService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CLASSES);
        return classesService.findById(id);
    }
    
    public static Subject getSubject() throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CLASSES);
    }
    
    public static boolean reserveClasses(String classID) throws Exception{
        ClassesService classesService = (ClassesService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CLASSES);
        return classesService.reserve(classID);
    }
    
    public static boolean releaseClasses(String classID) throws Exception{
        ClassesService classesService = (ClassesService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CLASSES);
        return classesService.release(classID);
    }
}
