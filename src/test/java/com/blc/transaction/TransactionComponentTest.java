package com.blc.transaction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import io.restassured.module.mockmvc.config.RestAssuredMockMvcConfig;
import io.restassured.module.mockmvc.specification.MockMvcRequestSpecification;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class TransactionComponentTest {

  @MockBean
  private TransactionService transactionService;

  @Autowired
  protected WebApplicationContext context;

  @BeforeEach
  public void init() {
    RestAssuredMockMvc.webAppContextSetup(context);
  }

  @AfterEach
  public void reset() {
    RestAssuredMockMvc.reset();
  }

  @Test
  public void  transaction_is_returned_with_account_number() {
    given()
      .get("http://localhost:8080/transaction/123").
    then()
      .statusCode(200);
  }
}
