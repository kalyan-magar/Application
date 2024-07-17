package com.nit.service;

import java.sql.Date;

public class LogicalOperationService {
	public boolean isPositive(int x) {
		System.out.println("LogicalOperationService.isPositive()");
		if(x<=0) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean isNull(java.util.Date d) {
		if(d==null) {
			return true;
		}else {
			return false;
		}
	}

}
