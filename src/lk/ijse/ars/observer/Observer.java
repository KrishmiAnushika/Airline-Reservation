/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.observer;

import java.rmi.Remote;

/**
 *
 * @author USER
 */
public interface Observer extends Remote{
    
    public void updateObservers() throws Exception;
    
}
