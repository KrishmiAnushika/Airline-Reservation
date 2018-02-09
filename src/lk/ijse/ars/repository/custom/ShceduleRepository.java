/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.repository.custom;

import antlr.collections.List;
import lk.ijse.ars.entity.Flight;
import lk.ijse.ars.entity.Shcedule;
import lk.ijse.ars.repository.SuperRepository;
import org.hibernate.Session;

/**
 *
 * @author USER
 */
public interface ShceduleRepository extends SuperRepository<Shcedule, String> {

    public Flight getAva(String origin, String distination,String time, Session s) throws Exception;
    
}
