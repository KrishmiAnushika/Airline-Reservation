/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom;

import java.util.List;
import lk.ijse.ars.business.SuperBO;
import lk.ijse.ars.dto.AirportDTO;


/**
 *
 * @author USER
 */
public interface AirportBO extends SuperBO{
    
    public boolean addAirport(AirportDTO airport) throws Exception;
    
    public boolean updateAirport(AirportDTO airport) throws Exception;
    
    public boolean deleteAirport(String airportID) throws Exception;
    
    public List<AirportDTO> getAllAirports() throws Exception;
    
}
