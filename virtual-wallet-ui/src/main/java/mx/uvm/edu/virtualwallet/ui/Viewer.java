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
* Nombre de archivo: Viewer.java
* Autor: salvgonz
* Fecha de creación: 24/07/2019
*/

package mx.uvm.edu.virtualwallet.ui;

import mx.uvm.edu.virtualwallet.ui.catalogos.CurrencyViewer;
import mx.uvm.edu.virtualwallet.ui.catalogos.OrderTypeViewer;

import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


/**
 * The Class Viewer.
 */
@Route("virtual-wallet")
public class Viewer extends VerticalLayout {
  
  /** serialVersionUID. */
  private static final long serialVersionUID = 4309524835504377800L;

  /** The accordion. */
  private Accordion accordion = new Accordion();

  /**
   * Instantiates a new viewer.
   */
  public Viewer() {
    accordion.setWidth("100%");    
    accordion.add("Catálogo de monedas", new CurrencyViewer().getCurrencyLayout());
    accordion.add("Catálogo de tipo de ordenes", new OrderTypeViewer().getOrderTypeLayout());
    add(accordion);
  }
}
