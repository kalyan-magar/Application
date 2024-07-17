package com.nit.service;

public class BankingOperationService{
	
public float calSimpleIntrest(float pay, float rate, float time) {
	if(pay==0||rate==0||time==0) {
		throw new IllegalArgumentException();
	}
	
	try {
		Thread.sleep(20000);
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	float intrest=(pay*rate*time)/100.0f;
	return intrest;
}
}
