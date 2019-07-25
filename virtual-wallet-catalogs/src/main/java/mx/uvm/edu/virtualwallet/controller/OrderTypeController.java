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
* Nombre de archivo: OrderTypeController.java
* Autor: salvgonz
* Fecha de creación: 23/07/2019
*/

package mx.uvm.edu.virtualwallet.controller;

import mx.uvm.edu.virtualwallet.model.OrderType;
import mx.uvm.edu.virtualwallet.repository.OrderTypeRepository;

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
 * The Class OrderTypeController.
 */
@RestController
public class OrderTypeController {

  /** The repository. */
  @Autowired
  private OrderTypeRepository repository;

  /**
   * Gets the order types.
   *
   * @return the order types
   */
  @RequestMapping(value = "/api/v1/order-types", method = RequestMethod.GET)
  public ResponseEntity<List<OrderType>> getOrderTypes() {
    return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
  }
  
  @RequestMapping(value = "/api/v1/order-types/{id}", method = RequestMethod.GET)
  public ResponseEntity<OrderType> getOrderType(@PathVariable(name = "id") Integer id) {
    return new ResponseEntity<>(repository.findById(id).get(), HttpStatus.OK);
  }
  
  @RequestMapping(value = "/api/v1/order-types", method = RequestMethod.POST)
  public ResponseEntity<OrderType> getOrderType(@RequestBody OrderType orderType) {
    return new ResponseEntity<>(repository.save(orderType), HttpStatus.OK);
  }
  
  @RequestMapping(value = "/api/v1/order-types/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<Object> deleteOrderType(@PathVariable(name = "id") Integer id) {
    repository.deleteById(id);
    return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
  }
}
