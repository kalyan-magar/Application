package com.nit.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

//@SelectPackages("com.nit.test")
@SelectClasses({TestBankingOperationService.class,TestLogicalOperationService.class})
@Suite
public class AllTestSuite {

}
