package com.example.demo;

import com.example.demo.strat.ContextSpringFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//
@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoApplicationTests {

	@Autowired
	private ContextSpringFactory factory;

	@Test
	public void contextLoads() {
		System.out.println("123");
		String result = factory.doAction("drug");
		System.out.println(result);
	}

}
