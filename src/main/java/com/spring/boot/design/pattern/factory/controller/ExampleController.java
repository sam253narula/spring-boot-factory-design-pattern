package com.spring.boot.design.pattern.factory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.design.pattern.factory.dto.OperationDto;
import com.spring.boot.design.pattern.factory.service.ArthimaticOperation;
import com.spring.boot.design.pattern.factory.service.OperationFactory;

@RestController
@RequestMapping("/home")
public class ExampleController {
	@Autowired
	OperationFactory operationFactory;

	@Autowired
	ArthimaticOperation arthimaticOperation;

	@PostMapping(value = "/arthimaticOperations")
	public OperationDto arthimaticoperationResult(@RequestBody OperationDto operation) {
		arthimaticOperation = operationFactory.getOperation(operation.getType());
		OperationDto dto = OperationDto.builder()
				.result(arthimaticOperation.performOperation(operation.getA(), operation.getB())).build();
		return dto;
	}

}
