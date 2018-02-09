/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.service.custom;

import java.util.List;
import lk.ijse.ars.dto.PasengerDTO;
import lk.ijse.ars.service.SuperService;

/**
 *
 * @author USER
 */
public interface PasengerService extends SuperService{
    public boolean addPasenger(PasengerDTO pasenger) throws Exception;
    public boolean deletePasenger(String pasengerID) throws Exception;
    public boolean updatePasenger(PasengerDTO pasenger) throws Exception;
    public List<PasengerDTO>getAllPasenger() throws Exception;
    
}
