package com.example.EurekaClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeoHierarchyController {

	
	@RequestMapping("GeoHierarchy")
	public String getName() 
	{
		if(true)
			throw new NullPointerException("Hello this is exception");
		return "GeoHierarchyController";
	}
}
