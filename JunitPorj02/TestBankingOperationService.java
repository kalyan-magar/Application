package com.nit.test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.nit.service.BankingOperationService;

@DisplayName("Bank class for testing ")

//@TestMethodOrder(OrderAnnotation.class)
//@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.DisplayName.class)
@TestMethodOrder(MethodName.class)
public class TestBankingOperationService {
  private static BankingOperationService bos;
  @BeforeAll
  public static void setup() {
	  System.out.println("TestBankingOperationService.setup()");
	  bos=new BankingOperationService();
  }
  @Test
 @DisplayName("with Big values")
  @Tag("test")// tag are used for our description 
  @Order(2)
  public void testCalSimpleIntestWithBigValues() {
	  System.out.println("TestBankingOperationService.testCalSimpleIntestWithBigValues()");
	  float expect=2400000.0f;
	  float actual=bos.calSimpleIntrest(10000000.0f,2.0f , 12.0f);
	  assertEquals(expect, actual,1.0f);
  }
  @BeforeEach
  public void setupBeforeEach() {
	  System.out.println("TestBankingOperationService.setupBeforeEach()");
  }
  
  @AfterEach
  public void setupAfterEach() {
	 System.out.println("TestBankingOperationService.setupAfterEach()");
  }
  
  @Test
  @DisplayName("Test with small values")
  @Tag("test")
  @Order(3)
  public void testCalSimpleIntestWithSmallValues() {
	  System.out.println("TestBankingOperationService.testCalSimpleIntestWithSmallValues()");
	  float expect=24000.0f;
	  float actual=bos.calSimpleIntrest(100000.0f,2.0f , 12.0f);
	  assertEquals(expect, actual,0.5f);
  }
  @Test
  @Tag("test")
  @Order(1)
  public void testCalSimpleIntrestWithAllValuesZero() {
	  System.out.println("TestBankingOperationService.testCalSimpleIntrestWithAllValuesZero()");
	  assertThrows(IllegalArgumentException.class, ()->{
		  bos.calSimpleIntrest(0.0f, 0.0f, 0.0f);
	  });
  }
  
  @Test
  @Tag("uat")
  @Tag("test")
  @Order(4)
  public void testWithTimeDuration() {
	  System.out.println("TestBankingOperationService.testWithTimeDuration()");
	  assertTimeout(Duration.ofMillis(20015), ()->{
		  bos.calSimpleIntrest(10000.0f, 2.0f, 12.0f);
		  
	  });
  }
  
  @AfterAll
  public static void tearDown() {
	  System.out.println("TestBankingOperationService.tearDown()");
	  bos=null;
	  System.out.println("testing ");
	  System.out.println("second testing");
  }
  
}
