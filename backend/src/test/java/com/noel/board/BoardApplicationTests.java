package com.noel.board;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;

@SpringBootTest
class BoardApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
	}

	@Test
	void test() {
		assert context != null;

		String[] beans = context.getBeanDefinitionNames();
		System.out.println("count = " + context.getBeanDefinitionCount());
		Arrays.asList(beans).forEach(b -> System.out.println("bean = " + b));
	}

}
