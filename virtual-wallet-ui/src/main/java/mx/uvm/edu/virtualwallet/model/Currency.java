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
* Nombre de archivo: Currency.java
* Autor: salvgonz
* Fecha de creación: 5/08/2019
*/


package mx.uvm.edu.virtualwallet.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The Class Currency.
 */

/**
 * Gets the currency short name.
 *
 * @return the currency short name
 */

/**
 * Gets the currency short name.
 *
 * @return the currency short name
 */
@Getter

/**
 * Sets the currency short name.
 *
 * @param currencyShortName the new currency short name
 */

/**
 * Sets the currency short name.
 *
 * @param currencyShortName the new currency short name
 */
@Setter
/**
 * Instantiates a new currency.
 *
 * @param idCurrency the id currency
 * @param currencyName the currency name
 * @param currencyShortName the currency short name
 */

/**
 * Instantiates a new currency.
 *
 * @param idCurrency the id currency
 * @param currencyName the currency name
 * @param currencyShortName the currency short name
 */

/**
 * Instantiates a new currency.
 *
 * @param idCurrency the id currency
 * @param currencyName the currency name
 * @param currencyShortName the currency short name
 */
@AllArgsConstructor

/**
 * Instantiates a new currency.
 */

/**
 * Instantiates a new currency.
 */
@NoArgsConstructor
public class Currency implements Serializable {
  
  /** serialVersionUID. */
  private static final long serialVersionUID = 7578186030786308342L;

  /** The id currency. */
  private Integer idCurrency;
  
  /** The currency name. */
  private String currencyName;
  
  /** The currency short name. */
  private String currencyShortName;
  
  /**
   * To string.
   *
   * @return the string
   */
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
  }
}
