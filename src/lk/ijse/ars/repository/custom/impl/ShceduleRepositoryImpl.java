/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.repository.custom.impl;

import antlr.collections.List;
import lk.ijse.ars.entity.Flight;
import lk.ijse.ars.entity.Shcedule;
import lk.ijse.ars.repository.SuperRepositoryImpl;
import lk.ijse.ars.repository.custom.ShceduleRepository;
import org.hibernate.Session;

/**
 *
 * @author USER
 */
public class ShceduleRepositoryImpl extends SuperRepositoryImpl<Shcedule, String> implements ShceduleRepository {

    public ShceduleRepositoryImpl() {

    }

    @Override
    public Flight getAva(String origin, String distination, String time, Session s) throws Exception {
        Object[] get = (Object[]) s.createSQLQuery("select flightName,number,type,destinationTakeOffTime from flight f,shcedule s where f.flightID=s.flight_flightID &&  s.origin='bnm' && s.destination='lkj' && s.destinationTakeOffTime='03:04 PM'").list().get(0);
        Flight f = new Flight();
        f.setFlightName(get[0].toString());
        f.setNumber(get[1].toString());
        f.setType(get[2].toString());
        
        return f;
    }

    

}
