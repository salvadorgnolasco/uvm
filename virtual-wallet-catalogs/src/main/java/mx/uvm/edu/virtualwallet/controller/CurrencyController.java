/*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <https://www.gnu.org/licenses/>.
* 
*
* Nombre de archivo: CurrencyController.java
* Autor: salvgonz
* Fecha de creación: 23/07/2019
*/

package mx.uvm.edu.virtualwallet.controller;


import mx.uvm.edu.virtualwallet.model.Currency;
import mx.uvm.edu.virtualwallet.repository.CurrencyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * The Class CurrencyController.
 */
@RestController
public class CurrencyController {

  /** The repository. */
  @Autowired
  private CurrencyRepository repository;

  /**
   * Gets the currencies.
   *
   * @return the currencies
   */
  @RequestMapping(value = "/api/v1/currencies", method = RequestMethod.GET)
  public List<Currency> getCurrencies() {
    return repository.findAll();
  }
  
  /**
   * Gets the one currency.
   *
   * @param id the id
   * @return the one currency
   */
  @RequestMapping(value = "/api/v1/currencies/{id}", method = RequestMethod.GET)
  public Currency getOneCurrency(@PathVariable Integer id) {
    return repository.findById(id).get();
  }
  
  /**
   * Delete currency.
   *
   * @param id the id
   * @return the response entity
   */
  @RequestMapping(value = "/api/v1/currencies/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<Object> deleteCurrency(@PathVariable Integer id) {
    repository.deleteById(id);
    
    return new ResponseEntity<>(HttpStatus.ACCEPTED);
  }
  
  /**
   * Adds the currency.
   *
   * @param id the id
   * @return the response entity
   */
  @RequestMapping(value = "/api/v1/currencies", method = RequestMethod.POST)
  public ResponseEntity<Object> addCurrency(@RequestBody Currency currency) {
    
    repository.save(currency);    
    return new ResponseEntity<>(HttpStatus.ACCEPTED);
  }
}

