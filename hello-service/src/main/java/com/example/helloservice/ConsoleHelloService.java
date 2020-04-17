package com.example.helloservice;

public class ConsoleHelloService implements HelloService {
	
	String prefix;
	String suffix;
	
	public ConsoleHelloService(){
		
	}
	
	public ConsoleHelloService(String prefix,String suffix){
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	@Override
	public void sayHello(String message) {
		System.out.println(prefix+" "+message+" "+suffix);
	}

}
