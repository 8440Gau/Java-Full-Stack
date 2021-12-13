package com.javatpoint.microservices.limitsservice;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.microservices.limitservice.bean.LimitConfiguration;  

@RestController  
public class LimitsConfigurationController   
{  
	
@Autowired
Configuration conf;
	
@GetMapping("/limits")  
public LimitConfiguration retriveLimitsFromConfigurations()  
{  
//return new LimitConfiguration(1000, 1);  
//getting values from the properties file  
	System.out.println("count");
return new LimitConfiguration(conf.getMaximum(), conf.getMinimum());
}  


}  


