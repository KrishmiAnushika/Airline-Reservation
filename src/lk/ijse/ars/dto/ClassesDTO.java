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
public class ClassesDTO extends SuperDTO{
    private String classID;
    private String className;
    

    public ClassesDTO() {
    }

    public ClassesDTO(String classID, String className) {
        this.classID = classID;
        this.className = className;
    }

    /**
     * @return the classID
     */
    public String getClassID() {
        return classID;
    }

    /**
     * @param classID the classID to set
     */
    public void setClassID(String classID) {
        this.classID = classID;
    }

    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className the className to set
     */
    public void setClassName(String className) {
        this.className = className;
    }

    
}
