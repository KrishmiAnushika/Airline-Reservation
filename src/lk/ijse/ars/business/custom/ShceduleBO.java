/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom;

import java.util.List;
import lk.ijse.ars.business.SuperBO;
import lk.ijse.ars.dto.FlightDTO;
import lk.ijse.ars.dto.ShceduleDTO;
import lk.ijse.ars.entity.Flight;
import org.hibernate.Session;


/**
 *
 * @author USER
 */
public interface ShceduleBO extends SuperBO{
    
    public boolean addShcedule(ShceduleDTO shcedule, FlightDTO flight) throws Exception;
    
    public boolean updateShcedule(ShceduleDTO shcedule) throws Exception;
    
    public boolean deleteShcedule(String shceduleID) throws Exception;
    
    public Flight getAva(String origin, String distination,String time, Session s) throws Exception;
    
    public List<ShceduleDTO> getAllShcedules() throws Exception;
    
}
