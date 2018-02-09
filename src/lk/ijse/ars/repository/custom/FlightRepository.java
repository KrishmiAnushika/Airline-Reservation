/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.repository.custom;

import lk.ijse.ars.entity.Flight;
import lk.ijse.ars.repository.SuperRepository;
import org.hibernate.Session;

/**
 *
 * @author USER
 */
public interface FlightRepository extends SuperRepository<Flight, String>{
    public Object getFlight(String flightName,Session s)throws Exception;
}
