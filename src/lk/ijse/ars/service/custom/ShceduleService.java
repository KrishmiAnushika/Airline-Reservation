/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.service.custom;

import java.util.List;
import lk.ijse.ars.dto.FlightDTO;
import lk.ijse.ars.dto.ShceduleDTO;
import lk.ijse.ars.service.SuperService;

/**
 *
 * @author USER
 */
public interface ShceduleService extends SuperService{
    
    public boolean addShcedule(ShceduleDTO shcedule, FlightDTO flight) throws Exception;
    public boolean deleteShcedule(String shceduleID) throws Exception;
    public boolean updateShcedule(ShceduleDTO shcedule) throws Exception;
    public List<ShceduleDTO>getAllShcedule() throws Exception;
    
}
