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
* Nombre de archivo: OrderType.java
* Autor: salvgonz
* Fecha de creación: 23/07/2019
*/

package mx.uvm.edu.virtualwallet.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


/**
 * The Class Order.
 */
@Getter
@Setter
public class OrderType implements Serializable {

  /**
   * serialVersionUID
   */
  private static final long serialVersionUID = 5419994075055521268L;

  /** The id order type. */
  private Integer idOrderType;
  
  /** The order type. */
  private String orderType;
}
