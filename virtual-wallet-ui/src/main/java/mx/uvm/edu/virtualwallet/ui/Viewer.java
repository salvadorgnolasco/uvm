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

import mx.uvm.edu.virtualwallet.model.Currency;

import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Viewer.
 */
@Route("virtual-wallet")
public class Viewer extends VerticalLayout {
  
  /** serialVersionUID. */
  private static final long serialVersionUID = 4309524835504377800L;

  /** The accordion. */
  private Accordion accordion = new Accordion();
  
  private TextField txCurrency;
  
  private TextField txShortName;
  
  private Button btnAddCurrency;
  
  private Grid<Currency> grid = new Grid<>(Currency.class);

  /**
   * Instantiates a new viewer.
   */
  public Viewer() {
    accordion.setWidth("100%");    
    accordion.add("Catálogo de monedas", getCurrencyLayout());
    add(accordion);
  }
  
  private HorizontalLayout getCurrencyForm() {
    
    HorizontalLayout layout = new HorizontalLayout();
    
    txCurrency = new TextField("Moneda");
    txShortName = new TextField("Nombre corto");
    
    layout.add(txCurrency);
    layout.add(txShortName);
    
    return layout;
  }
  
  private VerticalLayout getCurrencyLayout() {
    VerticalLayout layout = new VerticalLayout();
    List<Currency> currencies = new ArrayList<>();
    currencies.add(new Currency(1, "bitcoint", "btc"));
    currencies.add(new Currency(2, "ethereum", "eth"));
    
    grid.setItems(currencies);
    grid.setColumns("idCurrency", "currencyName", "currencyShortName");
    grid.setHeight("200px");
    grid.setWidth("100%");
    
    btnAddCurrency = new Button("Agregar moneda...");
   
    layout.add(getCurrencyForm());
    layout.add(btnAddCurrency);
    layout.add(grid);
    
    return layout;
  }
}
