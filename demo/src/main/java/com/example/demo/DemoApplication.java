package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("h1") //http://localhost:9090/h1
	public String hello1() {
		System.out.println("from hello1");
		return "hello from rest api";

	}
	
	@RequestMapping("t1") //http://localhost:9090/t1
	public int hello2() {
		System.out.println("from hello2");
		return 500;

	}
	
	@RequestMapping("xyz") //http://localhost:9090/xyz
	public int[] hello3() {
		System.out.println("from hello3");
		int[] elements = { 10, 20, 30};
		return elements;
	}
	
	@RequestMapping("list") // //http://localhost:9090/list
	public ArrayList<String> test4(){
		System.out.println("from test4");
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("xyz");
		list.add("test");
		return list;
		
	}

}
