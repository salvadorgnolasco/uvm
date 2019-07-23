package mx.uvm.edu.virtualwallet.controller;


import mx.uvm.edu.virtualwallet.model.Currency;
import mx.uvm.edu.virtualwallet.repository.CurrencyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CurrencyController {
  
  @Autowired
  private CurrencyRepository repository;

  @RequestMapping(value = "/api/v1/currencies", method = RequestMethod.GET)
  public List<Currency> getCurrencies() {
    return repository.findAll();
  }
}
