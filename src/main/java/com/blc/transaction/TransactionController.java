package com.blc.transaction;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/transaction", produces="application/json")
public class TransactionController  {

  private final TransactionService  service;

  public TransactionController(TransactionService  service) {
    this.service  = service;
  }

  @GetMapping("/{accountNumber}")
  public List<Transaction> findAllByAccountNumber(@PathVariable String  accountNumber) {
    System.err.println(service.findAllByAccountNumber(accountNumber));
    return service.findAllByAccountNumber(accountNumber);
  }

}
