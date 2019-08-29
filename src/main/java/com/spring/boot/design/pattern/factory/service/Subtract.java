package com.spring.boot.design.pattern.factory.service;

import org.springframework.stereotype.Service;

@Service
public class Subtract extends ArthimaticOperation {

	@Override
	public int performOperation(int a, int b) {
		return a - b;
	}
}