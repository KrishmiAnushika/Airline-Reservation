///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package lk.ijse.ars.business.custom.impl;
//
//import java.util.ArrayList;
//import java.util.List;
//import lk.ijse.ars.business.custom.AirlineBO;
//import lk.ijse.ars.dto.AirlineDTO;
//import lk.ijse.ars.dto.AirportDTO;
//import lk.ijse.ars.entity.Airline;
//import lk.ijse.ars.entity.Airport;
//import lk.ijse.ars.repository.RepositoryFactory;
//import lk.ijse.ars.repository.custom.AirlineRepository;
//import lk.ijse.ars.repository.custom.PasengerRepository;
//import lk.ijse.ars.resource.HibernateUtil;
//import org.hibernate.Session;
//
///**
// *
// * @author USER
// */
//public class AirlineBOImpl implements AirlineBO{
//    
//    private AirlineRepository airlineRepository;
//
//    public AirlineBOImpl() {
//        this.airlineRepository = (AirlineRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.AIRLINE);
//    }
//
//    @Override
//    public boolean addAirline(AirlineDTO airline) throws Exception {
//        try(Session session = HibernateUtil.getSessionFactory().openSession()){
//            airlineRepository.setSession(session);
//            session.beginTransaction();
//            
//            Airline a = new Airline(
//                    airline.getAirlineID(),
//                    airline.getAirlineName(),
//                    airline.getCountry());
//            
//                    boolean result = airlineRepository.save(a);
//                    session.getTransaction().commit();
//        return result;
//        }
//    }
//
//    @Override
//    public boolean updateAirline(AirlineDTO airline) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean deleteAirline(String airlineID) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public List<AirlineDTO> getAllAirlines() throws Exception {
//        try(Session session = HibernateUtil.getSessionFactory().openSession()){
//            airlineRepository.setSession(session);
//            session.beginTransaction();
//            
//            List<Airline>airlines = airlineRepository.findAll();
//            session.getTransaction().commit();
//            
//            if (airlines !=null) {
//                List<AirlineDTO> allAirlines = new ArrayList<>();
//                
//                for (Airline airline : airlines) {
//                  AirlineDTO adto = new AirlineDTO(airline.getAirlineID(),
//                          airline.getAirlineName(),
//                          airline.getCountry());
//                  
//                  allAirlines.add(adto);
//                }
//                return allAirlines;
//            }else{
//                return null;
//            }
//        }
//    }
//
//    @Override
//    public AirlineDTO findById(String id) throws Exception {
//         try(Session session = HibernateUtil.getSessionFactory().openSession()){
//            airlineRepository.setSession(session);
//            session.beginTransaction();
//            
//            Airline airline = airlineRepository.findById(id);
////            
//            
//            session.getTransaction().commit();
//            
//            if (airline !=null) {
////              
//                AirlineDTO airlineDTO = new AirlineDTO();
//                airlineDTO.setAirlineID(airlineDTO.getAirlineID());
//                        airlineDTO.setAirlineName(airline.getAirlineName());
//                        airlineDTO.setCountry(airline.getCountry());
////                flightDTO.setFlightID(flight.getFlightID());
////                flightDTO.setFlightName(flight.getFlightName());
////                flightDTO.setFlightNumber(flight.getNumber());
////                flightDTO.setType(flight.getType());
////                flightDTO.setAirlineDTO(new AirlineDTO(flight.getAirline().getAirlineID(), flight.getAirline().getAirlineName(), flight.getAirline().getCountry()));
//                return airlineDTO;
//                
//            }else{
//                return null;
//            }
//        }
//    }
//}
