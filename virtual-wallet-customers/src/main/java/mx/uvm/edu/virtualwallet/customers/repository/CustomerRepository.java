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
* Nombre de archivo: CustomerRepository.java
* Autor: salvgonz
* Fecha de creación: 23/07/2019
*/

package mx.uvm.edu.virtualwallet.customers.repository;

import mx.uvm.edu.virtualwallet.customers.model.Customer;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

/**
 * The Interface CustomerRepository.
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
  
  /**
   * Find all.
   *
   * @return the list of customers
   */
  List<Customer> findAll();
}
