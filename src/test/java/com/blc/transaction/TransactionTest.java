package com.blc.transaction;

import java.lang.Exception;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TransactionTest {

  @Test
  public void testFirstConstructorArgNull()  {
    assertThrows(java.lang.NullPointerException.class, () -> {
      new Transaction(null, "", "", (float)10.01, "","");
    });
  }

  @Test
  public void testSecondConstructorArgNull()  {
    assertThrows(java.lang.NullPointerException.class, () -> {
      new Transaction("", null, "", (float)10.01, "","");
    });
  }

  @Test
  public void testThirdConstructorArgNull()  {
    assertThrows(java.lang.NullPointerException.class, () -> {
      new Transaction("", "", null, (float)10.01, "","");
    });
  }

  @Test
  public void testFifthConstructorArgNull()  {
    assertThrows(java.lang.NullPointerException.class, () -> {
      new Transaction("", "", "", (float)10.01, null,"");
    });
  }

  @Test
  public void testGetters()  {
    Transaction t  = new Transaction("type", "123", "USD", (float)10.01, "Bob's","logo");
    assertTrue("type".equals(t.getType()));
    assertTrue("123".equals(t.getAccountNumber()));
    assertTrue("USD".equals(t.getCurrency()));
    assertTrue((float)10.01 == t.getAmount());
    assertTrue("Bob's".equals(t.getMerchantName()));
    assertTrue("logo".equals(t.getMerchantLogo()));
  }
}
