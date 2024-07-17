package com.nit.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.nit.service.LogicalOperationService;

public class TestLogicalOperationService {
public static LogicalOperationService service;
	@BeforeAll
	public static void setUp() {
		service= new LogicalOperationService();
	}
	@Test
	public void testIsPositiveWithPositive() {
//		boolean exp=true;
//		boolean act=service.isPositive(10);
		assertTrue(service.isPositive(10));
	}
	@Test
	public void testIsPositiveWithNegative() {
       assertFalse(service.isPositive(-10));
	}
	
	@Test
	public void testIsNullWithObject() {
		assertFalse(service.isNull(new Date()));
	}
	
	@Test
	public void testIsNullWithNull() {
		assertTrue(service.isNull(null));
	}
	
	@AfterAll
	public static void tearDown() {
		service=null;
	}
	
}
