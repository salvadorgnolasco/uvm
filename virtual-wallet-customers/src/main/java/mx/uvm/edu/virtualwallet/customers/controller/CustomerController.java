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
* Nombre de archivo: CustomerController.java
* Autor: salvgonz
* Fecha de creación: 23/07/2019
*/


package mx.uvm.edu.virtualwallet.customers.controller;

import mx.uvm.edu.virtualwallet.customers.model.Customer;
import mx.uvm.edu.virtualwallet.customers.repository.CustomerRepository;

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
 * The Class CustomerController.
 */
@RestController
public class CustomerController {
  
  /** The repository. */
  @Autowired
  private CustomerRepository repository;

  
  /**
   * Gets the customers.
   *
   * @return the customers
   */
  @RequestMapping(value = "/api/v1/customers", method = RequestMethod.GET, produces = "application/json")
  public ResponseEntity<List<Customer>> getCustomers() {
    
    return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
  }
  
  /**
   * Gets the customer.
   *
   * @param id the id
   * @return the customer
   */
  @RequestMapping(value = "/api/v1/customers/{id}", method = RequestMethod.GET, produces = "application/json")
  public ResponseEntity<Customer> getCustomer(@PathVariable(name = "id") Integer id) {
    
    return new ResponseEntity<>(repository.findById(id).get(), HttpStatus.OK);
  }
  
  /**
   * Adds the customer.
   *
   * @param customer the customer
   * @return the response entity
   */
  @RequestMapping(value = "/api/v1/customers", method = RequestMethod.POST, produces = "application/json")
  public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
    
    Customer newCustomer = repository.save(customer);
    
    return new ResponseEntity<>(newCustomer, HttpStatus.OK);
  }
  
  /**
   * Delete customer.
   *
   * @param id the id
   * @return the response entity
   */
  @RequestMapping(value = "/api/v1/customers/{id}", method = RequestMethod.DELETE, produces = "application/json")
  public ResponseEntity<Customer> deleteCustomer(@PathVariable(name = "id") Integer id) {
    
    repository.deleteById(id);
    
    return new ResponseEntity<>(HttpStatus.ACCEPTED);
  }
}
