package com.example.load.balance.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microservice2")
public class Microservice1 {
	
	 
	  @GetMapping("/port")
	  public String getPort()
	  {
	        return "port 8202";
	  }

}
