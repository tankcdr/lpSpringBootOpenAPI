package com.blc.transaction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransactionServiceTest {

  @Test
  public void testFindAllByAccountNumber()  {
    TransactionService transactionService = new TransactionService();
    int count  = transactionService.findAllByAccountNumber("123").size();
    assertTrue(count > 0,
        "TransactionService.findAllByAccountNumber() should return greater than 0. Value=  "+count);
  }
}
