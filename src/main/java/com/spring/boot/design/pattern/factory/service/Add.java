package com.spring.boot.design.pattern.factory.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
class Add extends ArthimaticOperation {

	@Override
	public int performOperation(int a, int b) {
		return a + b;
	}

}