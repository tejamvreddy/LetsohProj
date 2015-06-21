package com.letsoh.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.letsoh.service.LetsohUserService;
@Controller

public class LetsohLoginController {
	
	private LetsohUserService letsohUserService;
	private static final Logger logger = Logger.getLogger(LetsohLoginController.class);
	
	 @RequestMapping(value="/login.htm", method=RequestMethod.POST)
	    public ModelAndView getLoginPage() {
		 logger.info("logged in as");
	        ModelAndView mav = new ModelAndView("examples/login");
	        System.out.println("After Model Obj");
	        
	        return mav;
	    }
	

	
	public LetsohUserService getLetsohUserService() {
		return letsohUserService;
	}

	public void setLetsohUserService(LetsohUserService letsohUserService) {
		this.letsohUserService = letsohUserService;
	}
}
