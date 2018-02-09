/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom.impl;

import java.util.List;
import lk.ijse.ars.business.custom.ClassDetailsBO;
//import lk.ijse.ars.dto.AirlineDTO;
import lk.ijse.ars.dto.ClassDetailsDTO;
import lk.ijse.ars.dto.ClassesDTO;
import lk.ijse.ars.dto.FlightDTO;
//import lk.ijse.ars.entity.Airline;
import lk.ijse.ars.entity.ClassDetails;
import lk.ijse.ars.entity.ClassDetails_PK;
import lk.ijse.ars.entity.Classes;
import lk.ijse.ars.entity.Flight;
import lk.ijse.ars.repository.RepositoryFactory;
import lk.ijse.ars.repository.custom.ClassDetailsRepository;
import lk.ijse.ars.resource.HibernateUtil;
import org.hibernate.Session;


/**
 *
 * @author USER
 */
public class ClassDetailsBOImpl implements ClassDetailsBO{
    
    private ClassDetailsRepository classDetailsRepository;

    public ClassDetailsBOImpl() {
        this.classDetailsRepository = (ClassDetailsRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.CLASSDETAILS);
    }

    @Override
    public boolean addClassDetails(ClassDetailsDTO classDetails,ClassesDTO classes,FlightDTO flight) throws Exception {
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            classDetailsRepository.setSession(session);
            session.beginTransaction();
//
//            Airline b = new Airline();
                   
            
            Classes c = new Classes(classes.getClassID(),
                    classes.getClassName());

            Flight f = new Flight(flight.getFlightID(),
                    flight.getFlightName(),
                    flight.getFlightNumber(),
                    flight.getType(),
                    flight.getAirlineID()
            );
            
            ClassDetails_PK cdpk = new ClassDetails_PK(flight.getFlightID(),
                    classes.getClassID());
            
              ClassDetails cd = new ClassDetails(
                      classDetails.getWindowSeatCount(),
                      classDetails.getNormalSeatCount(),
                      classDetails.getClassFee(),
                      f,
                      c,
                      cdpk);

            boolean result = classDetailsRepository.save(cd);
            session.getTransaction().commit();
            return result;
            
        }
    }

    @Override
    public boolean updateClassDetails(ClassDetailsDTO classDetails) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteClassDetails(String classDetailsID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ClassDetailsDTO> getAllClassDetails() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
