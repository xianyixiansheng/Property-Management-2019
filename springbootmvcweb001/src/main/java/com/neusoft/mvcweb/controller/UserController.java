package com.neusoft.mvcweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/add")
	public void add()
	{
		System.out.println("添加成功。。。。。。");
	}
	
	
	
}
