/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.ars.business.custom.ClassesBO;
import lk.ijse.ars.dto.ClassesDTO;
import lk.ijse.ars.entity.Airline;
import lk.ijse.ars.entity.Classes;
import lk.ijse.ars.repository.RepositoryFactory;
import lk.ijse.ars.repository.custom.ClassesRepository;
import lk.ijse.ars.resource.HibernateUtil;
import org.hibernate.Session;


/**
 *
 * @author USER
 */
public class ClassesBOImpl implements ClassesBO{
    
    private ClassesRepository classesRepository;

    public ClassesBOImpl() {
        this.classesRepository = (ClassesRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.CLASSES);
    }

    @Override
    public boolean addClasses(ClassesDTO classes) throws Exception {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            classesRepository.setSession(session);
            session.beginTransaction();
            
            Classes a = new Classes(
                    classes.getClassID(),
                    classes.getClassName()
                    );
            
                    boolean result = classesRepository.save(a);
                    session.getTransaction().commit();
        return result;
    }
    }

    @Override
    public boolean updateClasses(ClassesDTO classes) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteClasses(String classID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ClassesDTO> getAllClass() throws Exception {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            classesRepository.setSession(session);
            session.beginTransaction();
            
            List<Classes>classeses = classesRepository.findAll();
            session.getTransaction().commit();
            
            if (classeses !=null) {
                List<ClassesDTO> allClassesDTOs = new ArrayList<>();
                
                for (Classes classes : classeses) {
                  ClassesDTO adto = new ClassesDTO(classes.getClassID(),
                          classes.getClassName());
                                            
                  allClassesDTOs.add(adto);
                }
                return allClassesDTOs;
            }else{
                return null;
            }
            }
    }

    @Override
    public ClassesDTO findById(String id) throws Exception {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            classesRepository.setSession(session);
            session.beginTransaction();
            
            Classes classes = classesRepository.findById(id);
//            
            
            session.getTransaction().commit();
            
            if (classes !=null) {
//              
                ClassesDTO classesDTO = new ClassesDTO();
                classesDTO.setClassID(classes.getClassID());
                classesDTO.setClassName(classes.getClassName());
                
                return classesDTO;
                
            }else{
                return null;
            }
        }
    }
}
