/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.service.custom;

import java.util.List;
import lk.ijse.ars.dto.ClassDetailsDTO;
import lk.ijse.ars.dto.ClassesDTO;
import lk.ijse.ars.dto.FlightDTO;
import lk.ijse.ars.service.SuperService;

/**
 *
 * @author USER
 */
public interface ClassDetailsService extends SuperService{
    
    public boolean addClassDetails(ClassDetailsDTO classDetails,ClassesDTO classes,FlightDTO flight) throws Exception;
    public boolean deleteClassDetails(String classDetailsID) throws Exception;
    public boolean updateClassDetails(ClassDetailsDTO classDetails) throws Exception;
    public List<ClassDetailsDTO>getAllClassDetails() throws Exception;
    
}