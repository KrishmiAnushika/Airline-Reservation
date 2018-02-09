/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.ars.business.custom.AirportBO;
import lk.ijse.ars.dto.AirportDTO;
import lk.ijse.ars.entity.Airport;
import lk.ijse.ars.repository.RepositoryFactory;
import lk.ijse.ars.repository.custom.AirportRepository;
import lk.ijse.ars.resource.HibernateUtil;
import org.hibernate.Session;


/**
 *
 * @author USER
 */
public class AirportBOImpl implements AirportBO{
    
    private AirportRepository airportRepository;
    //boolean result;
            
    public AirportBOImpl() {
        airportRepository = (AirportRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.AIRPORT);
    }

    @Override
    public boolean addAirport(AirportDTO airport) throws Exception {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            airportRepository.setSession(session);
            session.beginTransaction();
            
            Airport a = new Airport(
                    airport.getAirportID(),
                    airport.getAirportName(),
                    airport.getCountry());
            
                    boolean result = airportRepository.save(a);
                    session.getTransaction().commit();
        return result;
        }
        
        
    }

    @Override
    public boolean updateAirport(AirportDTO airport) throws Exception {
        
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
        
            airportRepository.setSession(session);
            session.beginTransaction();
            
            Airport a = new Airport(airport.getAirportID(), airport.getAirportName(), airport.getCountry());
            airportRepository.update(a);
            
            session.getTransaction().commit();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    @Override
    public boolean deleteAirport(String airportID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AirportDTO> getAllAirports() throws Exception {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            airportRepository.setSession(session);
            session.beginTransaction();
            
            List<Airport>airports = airportRepository.findAll();
            session.getTransaction().commit();
            
            if (airports !=null) {
                List<AirportDTO> allAirports = new ArrayList<>();
                
                for (Airport airport : airports) {
                  AirportDTO adto = new AirportDTO(airport.getAirportID(),
                          airport.getAirportName(),
                          airport.getCountry());
                  
                  allAirports.add(adto);
                }
                return allAirports;
            }else{
                return null;
            }
        }
    }
}
