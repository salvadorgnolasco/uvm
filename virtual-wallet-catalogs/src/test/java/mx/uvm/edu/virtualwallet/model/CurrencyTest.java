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
* Nombre de archivo: CurrencyTest.java
* Autor: salvgonz
* Fecha de creación: 6/10/2019
*/

package mx.uvm.edu.virtualwallet.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * The Class CurrencyTest.
 */
public class CurrencyTest {

  /**
   * Should create currency.
   */
  @Test
  public void shouldCreateCurrency() {
    Currency currency = new Currency(Integer.valueOf(33), "Name", "name");
    Currency currency2 = new Currency();
    currency2.setIdCurrency(Integer.valueOf(33));
    currency2.setCurrencyName("Name");
    currency2.setCurrencyShortName("name");

    assertEquals(currency.getIdCurrency(), currency2.getIdCurrency());
    assertEquals(currency.getCurrencyName(), currency2.getCurrencyName());
    assertEquals(currency.getCurrencyShortName(), currency2.getCurrencyShortName());
  }
}
