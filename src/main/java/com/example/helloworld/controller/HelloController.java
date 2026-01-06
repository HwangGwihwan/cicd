package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@ResponseBody
public class HelloController {
	
	@GetMapping("/")
	public String hello() throws InterruptedException {
		log.info("get request");
		bar();
		
		return "HelloWorld #3";
	}
	
	public void bar() throws InterruptedException {
		Thread.sleep(5000);
		log.info("end bar method");
	}
}
