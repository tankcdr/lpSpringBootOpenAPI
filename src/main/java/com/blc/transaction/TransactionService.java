package com.blc.transaction;

import  java.util.LinkedList;
import  java.util.List;

public class TransactionService  {

  public List<Transaction> findAllByAccountNumber(String accountNumber) {
    Transaction t  = new Transaction("type", accountNumber, "USD", (float)10.23, "Bob's Burgers", "");
    List<Transaction> listOfTransactions  = new LinkedList<Transaction>();
    listOfTransactions.add(t);
    return listOfTransactions;
  }

}
