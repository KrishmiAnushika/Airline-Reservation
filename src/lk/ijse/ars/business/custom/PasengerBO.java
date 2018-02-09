/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom;

import java.util.List;
import lk.ijse.ars.business.SuperBO;
import lk.ijse.ars.dto.PasengerDTO;

/**
 *
 * @author USER
 */
public interface PasengerBO extends SuperBO{
    
    public boolean addPasenger(PasengerDTO pasenger) throws Exception;
    
    public boolean updatePasenger(PasengerDTO pasenger) throws Exception;
    
    public boolean deletePasenger(String pasengerID) throws Exception;
    
    public List<PasengerDTO> getAllPasengers() throws Exception;
    
}
