package com.in28minutes.microservices.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	  @Autowired
	  private Configuration configuration;
	
	  @GetMapping("/limits")
	  public LimitConfiguration  retrieveLimitsFromConfigurations() {
		  //return new LimitConfiguration(1000,1);
		  return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
		  
	  }
	
}
