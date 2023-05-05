package com.codingcircle.demo.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/crud1")
public class crudController 
{
	
	
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public ResponseEntity<?> create()
	{
		String status="Test";
		Map<String,String> map=new HashMap<String,String>();
		map.put("Status", status);
		System.out.println("..................................................");
		System.out.println("Got a hit at service_1 at crud1/test..............");
		System.out.println("..................................................");
		return new ResponseEntity(map, HttpStatus.CREATED);
	}
	
	
	 
	
}
