package com.letsoh.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.letsoh.service.LetsohUserService;

public class LetsohHomeController extends AbstractController{
	
	private LetsohUserService letsohUserService;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		System.out.println("Inside handleRequestInternal :: LetsohHomeController");
		try {
			letsohUserService.getAllUsers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ModelAndView model = new ModelAndView("letsohHome");
		model.addObject("msg", "Wiht Git!!!");

		return model;
	}

	public LetsohUserService getLetsohUserService() {
		return letsohUserService;
	}

	public void setLetsohUserService(LetsohUserService letsohUserService) {
		this.letsohUserService = letsohUserService;
	}

	
	

}
