package com.july666.dubbotest.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.july666.dubbotest.api.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	public String hello(String name) {
		System.out.println("HelloService接收到消息:"+name);
		return "hello " + name;
	}
}
