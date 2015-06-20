package com.letsoh.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.letsoh.service.LetsohUserService;
import com.letsoh.service.impl.LetsohUserServiceImpl;

public class LetsohLoginController extends AbstractController{
	
	private LetsohUserService letsohUserService;
	private static final Logger logger = Logger.getLogger(LetsohLoginController.class);
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		logger.info("Inside handleRequestInternal :: LetsohLoginController");
		try {
			letsohUserService.getAllUsers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ModelAndView model = new ModelAndView("examples/login");
		model.addObject("msg", "Login there Git !!!");

		return model;
	}

	
	public LetsohUserService getLetsohUserService() {
		return letsohUserService;
	}

	public void setLetsohUserService(LetsohUserService letsohUserService) {
		this.letsohUserService = letsohUserService;
	}
}
