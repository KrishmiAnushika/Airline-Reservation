/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom;

import java.util.List;
import lk.ijse.ars.business.SuperBO;
//import lk.ijse.ars.dto.AirlineDTO;
import lk.ijse.ars.dto.FlightDTO;


/**
 *
 * @author USER
 */
public interface FlightBO extends SuperBO{
    
    public boolean addFlight(FlightDTO flight) throws Exception;
    
    public boolean updateFlight(FlightDTO flight) throws Exception;
    
    public boolean deleteFlight(String flightID) throws Exception;
    
    public FlightDTO findById(String id) throws Exception ;
    
    public FlightDTO searchByName(String name) throws Exception;
    
    public List<FlightDTO> getAllFlight() throws Exception;
}
