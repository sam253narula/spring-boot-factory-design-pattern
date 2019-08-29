package com.spring.boot.design.pattern.factory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationFactory {
	@Autowired
	public Add add;
	
	@Autowired
	public Subtract subtract;
	
	public ArthimaticOperation getOperation(String OperationType) {
		if (OperationType == null) {
			return null;
		} else if (OperationType.equalsIgnoreCase("add")) {
			return add;
		} else if (OperationType.equalsIgnoreCase("subtract")) {
			return subtract;
		}
		return null;
	}
}
