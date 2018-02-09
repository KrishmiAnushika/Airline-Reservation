/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom;

import java.util.List;
import lk.ijse.ars.business.SuperBO;
import lk.ijse.ars.dto.ClassDetailsDTO;
import lk.ijse.ars.dto.ClassesDTO;
import lk.ijse.ars.dto.FlightDTO;


/**
 *
 * @author USER
 */
public interface ClassDetailsBO extends SuperBO{
    
    public boolean addClassDetails(ClassDetailsDTO classDetails,ClassesDTO classes,FlightDTO flight) throws Exception;
    
    public boolean updateClassDetails(ClassDetailsDTO classDetails) throws Exception;
    
    public boolean deleteClassDetails(String classDetailsID) throws Exception;
           
    public List<ClassDetailsDTO> getAllClassDetails() throws Exception;
    
}
