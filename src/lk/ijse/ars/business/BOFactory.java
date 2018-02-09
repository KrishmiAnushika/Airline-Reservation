/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business;

//import lk.ijse.ars.business.custom.impl.AirlineBOImpl;
import lk.ijse.ars.business.custom.impl.AirportBOImpl;
import lk.ijse.ars.business.custom.impl.BookingBOImpl;
import lk.ijse.ars.business.custom.impl.BookingDetailsBOImpl;
import lk.ijse.ars.business.custom.impl.ClassDetailsBOImpl;
import lk.ijse.ars.business.custom.impl.ClassesBOImpl;
import lk.ijse.ars.business.custom.impl.FlightBOImpl;
import lk.ijse.ars.business.custom.impl.PasengerBOImpl;
import lk.ijse.ars.business.custom.impl.PaymentBOImpl;
import lk.ijse.ars.business.custom.impl.ShceduleBOImpl;
import lk.ijse.ars.entity.Pasenger;

/**
 *
 * @author USER
 */
public class BOFactory {
  public enum BOTypes{
      PASENGER,PAYMENT,CLASSES,AIRPORT,FLIGHT,BOOKING,BOOKINGDETAILS,CLASSDETAILS,SHCEDULE
  }
  private static BOFactory bOFactory;
  
  private BOFactory(){}
  
  public static BOFactory getInstance(){
      if (bOFactory == null) {
          bOFactory = new BOFactory();
      }
      return bOFactory;
  }
  
  public SuperBO getBO(BOTypes type){
      switch(type){
            case PASENGER:
                return new PasengerBOImpl();
            case PAYMENT:
                return new PaymentBOImpl();
//            case AIRLINE:
//                return new AirlineBOImpl();
            case CLASSES:
                return new ClassesBOImpl();
            case AIRPORT:
                return new AirportBOImpl();
            case FLIGHT:
                return new FlightBOImpl();
            case BOOKING:
                return new BookingBOImpl();
            case BOOKINGDETAILS:
                return new BookingDetailsBOImpl();
            case CLASSDETAILS:
                return new ClassDetailsBOImpl();
            case SHCEDULE:
                return new ShceduleBOImpl();
            default:
                return null;
                
        }
    }
}
