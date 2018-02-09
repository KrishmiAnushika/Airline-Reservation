/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.repository.custom.impl;

import lk.ijse.ars.entity.Flight;
import lk.ijse.ars.repository.SuperRepositoryImpl;
import lk.ijse.ars.repository.custom.FlightRepository;
import org.hibernate.Session;

/**
 *
 * @author USER
 */
public class FlightRepositoryImpl extends SuperRepositoryImpl<Flight, String> implements FlightRepository {

    public FlightRepositoryImpl() {

    }

    @Override
    public Flight getFlight(String flightName, Session s) throws Exception {
//        System.out.println(flightName);
        Object get[] = (Object[]) s.createSQLQuery("Select *from flight where flightName='" + flightName + "'").list().get(0);
        Flight flight = new Flight();
        flight.setFlightID(get[0].toString());
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAA"+flight.getFlightID());
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBB"+get[0]);
        flight.setFlightName(get[1].toString());
        flight.setNumber(get[2].toString());
        flight.setType(get[3].toString());
        
        return flight;
    }

}
