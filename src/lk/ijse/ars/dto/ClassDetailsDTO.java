/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.dto;

/**
 *
 * @author USER
 */
public class ClassDetailsDTO extends SuperDTO{
   
   private String windowSeatCount;
//   private String noOfSeat;
   private String normalSeatCount;
   private double classFee;
   private ClassesDTO classDTO;
   private FlightDTO flightDTO;

    public ClassDetailsDTO() {
    }

    public ClassDetailsDTO(String windowSeatCount, String normalSeatCount, double classFee, ClassesDTO classDTO, FlightDTO flightDTO) {
        this.windowSeatCount = windowSeatCount;
        this.normalSeatCount = normalSeatCount;
        this.classFee = classFee;
        this.classDTO = classDTO;
        this.flightDTO = flightDTO;
    }

    /**
     * @return the windowSeatCount
     */
    public String getWindowSeatCount() {
        return windowSeatCount;
    }

    /**
     * @param windowSeatCount the windowSeatCount to set
     */
    public void setWindowSeatCount(String windowSeatCount) {
        this.windowSeatCount = windowSeatCount;
    }

    /**
     * @return the normalSeatCount
     */
    public String getNormalSeatCount() {
        return normalSeatCount;
    }

    /**
     * @param normalSeatCount the normalSeatCount to set
     */
    public void setNormalSeatCount(String normalSeatCount) {
        this.normalSeatCount = normalSeatCount;
    }

    /**
     * @return the classFee
     */
    public double getClassFee() {
        return classFee;
    }

    /**
     * @param classFee the classFee to set
     */
    public void setClassFee(double classFee) {
        this.classFee = classFee;
    }

    /**
     * @return the classDTO
     */
    public ClassesDTO getClassDTO() {
        return classDTO;
    }

    /**
     * @param classDTO the classDTO to set
     */
    public void setClassDTO(ClassesDTO classDTO) {
        this.classDTO = classDTO;
    }

    /**
     * @return the flightDTO
     */
    public FlightDTO getFlightDTO() {
        return flightDTO;
    }

    /**
     * @param flightDTO the flightDTO to set
     */
    public void setFlightDTO(FlightDTO flightDTO) {
        this.flightDTO = flightDTO;
    }

    
}
