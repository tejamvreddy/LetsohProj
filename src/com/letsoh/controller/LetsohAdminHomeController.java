package com.letsoh.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.letsoh.service.LetsohUserService;

@Controller
public class LetsohAdminHomeController {
	
	@Autowired
	private LetsohUserService letsohUserService;
	private static final Logger logger = Logger.getLogger(LetsohAdminHomeController.class);
	
	 @RequestMapping(value="/letsohAdminHome.htm", method=RequestMethod.GET)
	    public ModelAndView getAdminLoginPage() {
		 logger.info("Logger for AdminHome");
		 System.out.println("Start of getAdminLoginPage");
		 ModelAndView mav = null;
		try {
			mav = new ModelAndView("admin/letsohAdminHome");
			 
			 System.out.println("End of getAdminLoginPage");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return mav;
		 
	 }
	
	
	
	
	
	public LetsohUserService getLetsohUserService() {
		return letsohUserService;
	}
	public void setLetsohUserService(LetsohUserService letsohUserService) {
		this.letsohUserService = letsohUserService;
	}

	
	
	
}
