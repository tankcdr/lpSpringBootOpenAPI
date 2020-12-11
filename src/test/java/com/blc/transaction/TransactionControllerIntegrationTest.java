package com.blc.transaction;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.http.MediaType;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(TransactionController.class)
public class TransactionControllerIntegrationTest {

  @Autowired
   private MockMvc mockMvc;

   @MockBean
   private TransactionService transactionService;

  @Test
  public void shouldReturnAllusersForAccountNumber() throws  Exception  {
      when(transactionService.findAllByAccountNumber("123"))
        .thenReturn(List.of(new Transaction("type", "123", "USD", (float)10.00, "Burgers","")));

      this.mockMvc.perform(get("/transaction/123"))
                  .andExpect(status().isOk())
                  .andExpect(jsonPath("$[0].type").value("type"))
                  .andExpect(jsonPath("$[0].accountNumber").value("123"))
                  .andExpect(jsonPath("$[0].currency").value("USD"));
  }

}
