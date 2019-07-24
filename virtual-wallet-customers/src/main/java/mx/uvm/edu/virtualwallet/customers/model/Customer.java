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
* Nombre de archivo: Customer.java
* Autor: salvgonz
* Fecha de creación: 23/07/2019
*/

package mx.uvm.edu.virtualwallet.customers.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Customer.
 */
@Getter
@Setter
@Entity
@Table(name = "Cliente")
/**
 * Instantiates a new customer.
 *
 * @param idCustomer the id customer
 * @param customerName the customer name
 * @param firstLastName the first last name
 * @param secondLastName the second last name
 * @param phoneNumber the phone number
 * @param email the email
 * @param bookingDate the booking date
 */
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

  /** The id customer. */
  @Id
  @Column(name = "idCliente", length = 11)
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer idCustomer;
  
  /** The customer name. */
  @Column(name = "nombreCliente", length = 45)
  private String customerName;
  
  /** The first last name. */
  @Column(name = "apellidoPaternoCliente", length = 45)
  private String firstLastName;
  
  /** The second last name. */
  @Column(name = "apellidoMaternoCliente", length = 45)
  private String secondLastName;
  
  /** The phone number. */
  @Column(name = "telefonoCliente", nullable = true, length = 45)
  private String phoneNumber;
  
  /** The email. */
  @Column(name = "emailCliente", length = 45)
  private String email;
  
  /** The booking date. */
  @Column(name = "fechaAltaCliente")
  private String bookingDate;
}
