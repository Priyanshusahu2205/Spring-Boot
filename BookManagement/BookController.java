package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.repository.Bookinterface;

@RestController
public class BookController {
	
	@Autowired
	private Bookinterface b1;
	
	@GetMapping("/getbookdata")
	public List getbookdata() {
		
		List l1 = b1.findAll();
		return l1;
	}

}
