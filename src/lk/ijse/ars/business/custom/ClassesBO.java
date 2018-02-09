/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom;

import java.util.List;
import lk.ijse.ars.business.SuperBO;
import lk.ijse.ars.dto.ClassesDTO;


/**
 *
 * @author USER
 */
public interface ClassesBO extends SuperBO{
    
    public boolean addClasses(ClassesDTO classes) throws Exception;
    
    public boolean updateClasses(ClassesDTO classes) throws Exception;
    
    public boolean deleteClasses(String classID) throws Exception;
    
    public ClassesDTO findById(String id) throws Exception ;
    
    public List<ClassesDTO> getAllClass() throws Exception;
    
}
