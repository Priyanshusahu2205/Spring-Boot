package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Loginmodel;
import com.demo.service.Loginservice;

@Controller
public class Jspcontroller {
	
	@Autowired
	private Loginservice lservice;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/add")
	public String add() {
		return "add";
	}
	
	@PostMapping(value="/register")
	public Loginmodel savedata(Loginmodel lm1) {
		return lservice.saverecord(lm1);
	}
	
	@RequestMapping("/delete")
	public String delete() {
		return "delete";
	}
	
	@PostMapping(value="/deletedata")
	public void  deletedata()
	{
		lservice.deleterecord();
	}

}
