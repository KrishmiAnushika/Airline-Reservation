/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.service.custom;

import java.util.List;
//import lk.ijse.ars.dto.AirlineDTO;
import lk.ijse.ars.dto.FlightDTO;
import lk.ijse.ars.service.SuperService;

/**
 *
 * @author USER
 */
public interface FlightService extends SuperService{
    
    public boolean addFlight(FlightDTO flight) throws Exception;
    public boolean deleteFlight(String flightID) throws Exception;
    public boolean updateFlight(FlightDTO flight) throws Exception;
    public FlightDTO findById(String id) throws Exception ;
    public FlightDTO searchByName(String name) throws Exception ;
    public List<FlightDTO>getAllFlight() throws Exception;
    
}
