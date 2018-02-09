/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.ars.business.custom.FlightBO;
//import lk.ijse.ars.dto.AirlineDTO;
import lk.ijse.ars.dto.FlightDTO;
//import lk.ijse.ars.entity.Airline;
import lk.ijse.ars.entity.Flight;
import lk.ijse.ars.repository.RepositoryFactory;
import lk.ijse.ars.repository.custom.AirlineRepository;
import lk.ijse.ars.repository.custom.FlightRepository;
import lk.ijse.ars.resource.HibernateUtil;
//import lk.ijse.ars.service.custom.AirlineService;
import org.hibernate.Session;

/**
 *
 * @author USER
 */
public class FlightBOImpl implements FlightBO {

    private FlightRepository flightRepository;
//    private AirlineRepository airlineRepository;

    public FlightBOImpl() {
        this.flightRepository = (FlightRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.FLIGHT);
//        this.airlineRepository = (AirlineRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.AIRLINE);
    }

    @Override
    public boolean addFlight(FlightDTO flight) throws Exception {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            flightRepository.setSession(session);
//            airlineRepository.setSession(session);
            session.beginTransaction();

//            List<Airline> findAll = AirlineService.
//            Airline a = null;
//            for (Airline findAll1 : findAll) {
//                if (findAll1.getAirlineName().equalsIgnoreCase(airline)) {
//                    new Airline(
//                            findAll1.getAirlineID(),
//                            findAll1.getAirlineName(),
//                            findAll1.getCountry()
//                    );
//                }
//            }
//            Airline b = new Airline(
//                    airline.getAirlineID(),
//                    airline.getAirlineName(),
//                    airline.getCountry()
//            );
            
            Flight f = new Flight(flight.getFlightID(),
                    flight.getFlightName(),
                    flight.getFlightNumber(),
                    flight.getType(),
                    flight.getAirlineID());

            boolean result = flightRepository.save(f);
            session.getTransaction().commit();
            return result;
        }
    }

    @Override
    public boolean updateFlight(FlightDTO flight) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteFlight(String flightID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FlightDTO> getAllFlight() throws Exception {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            flightRepository.setSession(session);
            session.beginTransaction();

            List<Flight> flights = flightRepository.findAll();
            session.getTransaction().commit();

            if (flights != null) {
                List<FlightDTO> allFlights = new ArrayList<>();

                for (Flight flight : flights) {
//                    AirlineDTO at = new AirlineDTO(flight.getAirline().getAirlineID(), flight.getAirline().getAirlineName(), flight.getAirline().getCountry());
                    FlightDTO flightDTO = new FlightDTO(flight.getFlightID(),
                            flight.getFlightName(),
                            flight.getNumber(),
                            flight.getType(), flight.getAirlineID()
                    );

                    allFlights.add(flightDTO);
                }
                return allFlights;
            } else {
                return null;
            }
        }

    }

    @Override
    public FlightDTO findById(String id) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            flightRepository.setSession(session);
            session.beginTransaction();

            Flight flight = flightRepository.findById(id);
//            

            session.getTransaction().commit();

            if (flight != null) {
//              
                FlightDTO flightDTO = new FlightDTO();
                flightDTO.setFlightID(flight.getFlightID());
                flightDTO.setFlightName(flight.getFlightName());
                flightDTO.setFlightNumber(flight.getNumber());
                flightDTO.setType(flight.getType());
                flightDTO.setAirlineID(flight.getAirlineID());
//                flightDTO.setAirlineDTO(new AirlineDTO(flight.getAirline().getAirlineID(), flight.getAirline().getAirlineName(), flight.getAirline().getCountry()));
                return flightDTO;

            } else {
                return null;
            }
        }
    }

    @Override
    public FlightDTO searchByName(String name) throws Exception {
        try (Session s = HibernateUtil.getSessionFactory().openSession()) {
            s.beginTransaction();
            Flight f = (Flight) flightRepository.getFlight(name, s);
            FlightDTO fdto = new FlightDTO();
            fdto.setFlightID(f.getFlightID());
             fdto.setFlightName(f.getFlightName());
                fdto.setFlightNumber(f.getNumber());
                fdto.setType(f.getType());
//                fdto.setAirlineDTO(new AirlineDTO(f.getAirline().getAirlineID(), f.getAirline().getAirlineName(), f.getAirline().getCountry()));
                return fdto;
        }
    }
}
