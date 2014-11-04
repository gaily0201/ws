package cn.gaily.service.impl;

import cn.gaily.service.IHelloService;

public class HelloServiceImpl implements IHelloService {

	@Override
	public String getInfo(String value) {
		System.out.println("hello service");
		return value;
	}

}
