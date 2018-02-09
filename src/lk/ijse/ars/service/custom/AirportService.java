/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.service.custom;

import java.util.List;
import lk.ijse.ars.dto.AirportDTO;
import lk.ijse.ars.service.SuperService;

/**
 *
 * @author USER
 */
public interface AirportService extends SuperService{
    
    public boolean addAirport(AirportDTO airport) throws Exception;
    public boolean deleteAirport(String airportID) throws Exception;
    public boolean updateAirport(AirportDTO airport) throws Exception;
    public List<AirportDTO>getAllAirport() throws Exception;
    
}
