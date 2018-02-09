/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.service.custom;

import java.util.List;
import lk.ijse.ars.dto.CountryDTO;
import lk.ijse.ars.service.SuperService;

/**
 *
 * @author USER
 */
public interface CountryService extends SuperService{
    
    public boolean addCountry(CountryDTO country) throws Exception;
    public boolean deleteCountry(String countryID) throws Exception;
    public boolean updateCountry(CountryDTO country) throws Exception;
    public List<CountryDTO>getAllCountrys() throws Exception;
    
}
