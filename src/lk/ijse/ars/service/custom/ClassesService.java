/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.service.custom;

import java.util.List;
import lk.ijse.ars.dto.ClassesDTO;
import lk.ijse.ars.service.SuperService;

/**
 *
 * @author USER
 */
public interface ClassesService extends SuperService{
    
    public boolean addClass(ClassesDTO classDTO) throws Exception;
    public boolean deleteClass(String classID) throws Exception;
    public boolean updateClass(ClassesDTO classDTO) throws Exception;
    public ClassesDTO findById(String id) throws Exception ;
    public List<ClassesDTO>getAllClass() throws Exception;
    
}
