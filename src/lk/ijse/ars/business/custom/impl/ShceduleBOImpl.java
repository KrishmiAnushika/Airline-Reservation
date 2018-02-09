/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.ars.business.custom.ShceduleBO;
//import lk.ijse.ars.dto.AirlineDTO;
import lk.ijse.ars.dto.FlightDTO;
import lk.ijse.ars.dto.ShceduleDTO;
//import lk.ijse.ars.entity.Airline;
import lk.ijse.ars.entity.Flight;
import lk.ijse.ars.entity.Shcedule;
import lk.ijse.ars.repository.RepositoryFactory;
import lk.ijse.ars.repository.custom.AirlineRepository;
import lk.ijse.ars.repository.custom.FlightRepository;
import lk.ijse.ars.repository.custom.ShceduleRepository;
import lk.ijse.ars.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author USER
 */
public class ShceduleBOImpl implements ShceduleBO {

    private ShceduleRepository shceduleRepository;
    private FlightRepository flightRepository;
//    private AirlineRepository airlineRepository;

    public ShceduleBOImpl() {
        this.shceduleRepository = (ShceduleRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.SHCEDULE);
        this.flightRepository = (FlightRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.FLIGHT);
//        this.airlineRepository = (AirlineRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.AIRLINE);
    }

    @Override
    public boolean addShcedule(ShceduleDTO shcedule, FlightDTO flight) throws Exception {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            
            shceduleRepository.setSession(session);
            session.beginTransaction();
            

            Flight a = new Flight();
            a.setFlightID(flight.getFlightID());
            a.setFlightName(flight.getFlightName());
            a.setNumber(flight.getFlightNumber());
            a.setType(flight.getType());
            a.setAirlineID(flight.getAirlineID());
        
            Shcedule s = new Shcedule(
                    0,
                    shcedule.getOrigin(),
                    shcedule.getDestination(),
                    shcedule.getOriginTakeOffDate(),
                    shcedule.getOriginTakeOffTime(),
                    shcedule.getDestinationTakeOffDate(),
                    shcedule.getDestinationTakeOffTime(),
                    shcedule.getTripCost(),
                    a
            );
            boolean result = shceduleRepository.save(s);

            session.getTransaction().commit();
            return result;
        }
    }

    @Override
    public boolean updateShcedule(ShceduleDTO shcedule) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteShcedule(String shceduleID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ShceduleDTO> getAllShcedules() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            shceduleRepository.setSession(session);
            session.beginTransaction();

            List<Shcedule> shcedules = shceduleRepository.findAll();
            session.getTransaction().commit();

            if (shcedules != null) {
                List<ShceduleDTO> allShcedules = new ArrayList<>();

                for (Shcedule shcedule : shcedules) {
//                    AirlineDTO at = new AirlineDTO(flight.getAirline().getAirlineID(), flight.getAirline().getAirlineName(), flight.getAirline().getCountry());
                    ShceduleDTO shceduleDTO = new ShceduleDTO(
                            shcedule.getShceduleID(),
                            shcedule.getOrigin(),
                            shcedule.getDestination(),
                            shcedule.getOriginTakeOffDate(),
                            shcedule.getOriginTakeOffTime(),
                            shcedule.getDestinationTakeOffDate(),
                            shcedule.getDestinationTakeOffTime(),
                            shcedule.getTripCost(),
                            new FlightDTO(shcedule.getFlight().getFlightID(), shcedule.getFlight().getFlightName(), shcedule.getFlight().getNumber(), shcedule.getFlight().getType(), shcedule.getFlight().getAirlineID()
//                            new AirlineDTO(shcedule.getFlight().getAirline().getAirlineID(), shcedule.getFlight().getAirline().getAirlineName(), shcedule.getFlight().getAirline().getCountry()))
                    ));

                    allShcedules.add(shceduleDTO);
                }
                return allShcedules;
            } else {
                return null;
            }
        }
//                  shceduleRepository.setSession(session);
//            session.beginTransaction();
//
//            List<Shcedule> shcedules = shceduleRepository.findAll();
//            session.getTransaction().commit();
//
//            if (shcedules != null) {
//                List<ShceduleDTO> allShcedules = new ArrayList<>();
//
//                for (Shcedule shcedule : shcedules) {
////                    AirlineDTO at = new AirlineDTO(flight.getAirline().getAirlineID(), flight.getAirline().getAirlineName(), flight.getAirline().getCountry());
//                    ShceduleDTO shceduleDTO = new ShceduleDTO(shcedule.getShceduleID(),
//                            shcedule.getOrigin(),
//                            shcedule.getDestination(),
//                            shcedule.getOriginTakeOffDate(),
//                            shcedule.getOriginTakeOffTime(),
//                            shcedule.getDestinationTakeOffDate(),
//                            shcedule.getDestinationTakeOffTime(),
//                            shcedule.getTripCost(),null
//                    );
//
//                    allShcedules.add(shceduleDTO);
//                }
//                return allShcedules;
//            } else {
//                return null;
//            }
//        }
    }

    @Override
    public Flight getAva(String origin, String distination, String time, Session s) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
