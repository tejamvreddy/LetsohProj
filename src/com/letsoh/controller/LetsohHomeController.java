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
	
	/*@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		logger.info("Inside handleRequestInternal :: LetsohHomeController");
		try {
			letsohUserService.getAllUsers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ModelAndView model = new ModelAndView("letsohHome");
		model.addObject("msg", "Wiht Git!!!");

		return model;
	}*/

	@RequestMapping("/letsohHome.htm")
	public ModelAndView testMethod(){
		logger.info("Inside testMethod -> Request Mappng Success");
		return new ModelAndView("letsohHome");
	}
	
	public LetsohUserService getLetsohUserService() {
		return letsohUserService;
	}

	public void setLetsohUserService(LetsohUserService letsohUserService) {
		this.letsohUserService = letsohUserService;
	}

	
	

}
