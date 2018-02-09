/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.resource;

import java.io.File;
import lk.ijse.ars.entity.Airline;
import lk.ijse.ars.entity.Airport;
import lk.ijse.ars.entity.Booking;
import lk.ijse.ars.entity.BookingDetails;
import lk.ijse.ars.entity.ClassDetails;
import lk.ijse.ars.entity.Classes;
import lk.ijse.ars.entity.Flight;
import lk.ijse.ars.entity.Pasenger;
import lk.ijse.ars.entity.Payment;
import lk.ijse.ars.entity.Shcedule;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author USER
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    private static StandardServiceRegistry registry;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            File hibernateProperties = new File("Settings/Hibernate.properties");
            registry = new StandardServiceRegistryBuilder().loadProperties(hibernateProperties).build();
            
            sessionFactory = new MetadataSources(registry)
                    .addAnnotatedClass(Pasenger.class)
                    .addAnnotatedClass(Payment.class)
                    .addAnnotatedClass(Airline.class)
                    .addAnnotatedClass(Classes.class)
                    .addAnnotatedClass(Airport.class)
                    .addAnnotatedClass(Flight.class)
                    .addAnnotatedClass(Booking.class)
                    .addAnnotatedClass(BookingDetails.class)
                    .addAnnotatedClass(ClassDetails.class)
                    .addAnnotatedClass(Shcedule.class)
                    .buildMetadata().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            
            StandardServiceRegistryBuilder.destroy(registry);
            
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
