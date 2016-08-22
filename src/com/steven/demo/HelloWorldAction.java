package com.steven.demo;

import com.steven.ws.client.HelloService;
import com.steven.ws.client.HelloServiceService;

public class HelloWorldAction {
	   private String name;

	   public String doit() throws Exception {
	      return "success";
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
		   
		   HelloServiceService hs = new HelloServiceService();
		   HelloService s = hs.getHelloServicePort();
		   this.name = s.sayHello(name);
		   	
	      //this.name = name;
	   }
}
