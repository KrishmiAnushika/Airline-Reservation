/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.business.custom.impl;

import java.util.List;
import lk.ijse.ars.business.custom.PasengerBO;
import lk.ijse.ars.dto.PasengerDTO;
import lk.ijse.ars.repository.RepositoryFactory;
import lk.ijse.ars.repository.custom.PasengerRepository;

/**
 *
 * @author USER
 */
public class PasengerBOImpl implements PasengerBO{
    
    private PasengerRepository pasengerRepository;

    public PasengerBOImpl() {
        this.pasengerRepository = (PasengerRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.PASENGER);
    }
    

    @Override
    public boolean addPasenger(PasengerDTO pasenger) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updatePasenger(PasengerDTO pasenger) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletePasenger(String pasengerID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PasengerDTO> getAllPasengers() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
