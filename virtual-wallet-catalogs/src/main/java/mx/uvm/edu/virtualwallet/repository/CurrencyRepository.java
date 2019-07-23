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
* Nombre de archivo: CurrencyRepository.java
* Autor: salvgonz
* Fecha de creación: 22/07/2019
*/

package mx.uvm.edu.virtualwallet.repository;

import mx.uvm.edu.virtualwallet.model.Currency;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * The Interface CurrencyRepository.
 */
public interface CurrencyRepository extends CrudRepository<Currency, Integer> {
  List<Currency> findAll();
}
