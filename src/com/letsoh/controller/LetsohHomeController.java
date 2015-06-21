package com.letsoh.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.letsoh.service.LetsohUserService;

@Controller

public class LetsohHomeController {
	@Autowired
	private LetsohUserService letsohUserService;
	private static final Logger logger = Logger.getLogger(LetsohHomeController.class);
	
	

	@RequestMapping("/letsohHome.htm")
	public ModelAndView testMethod(){
		logger.info("Inside testMethod -> Request Mappng Success");
		try{
		letsohUserService.getAllUsers();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ModelAndView("letsohHome");
	}
	
	public LetsohUserService getLetsohUserService() {
		return letsohUserService;
	}

	public void setLetsohUserService(LetsohUserService letsohUserService) {
		this.letsohUserService = letsohUserService;
	}

	
	

}
