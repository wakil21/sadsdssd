package com.wk.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wk.service.WishMessageService;

@Controller
public class ShowHomeController {
      @Autowired
	private WishMessageService service;
      
	@RequestMapping("/")
	public String showHome() {
		System.out.println("ShowHomeController.showHome()");
		return "home";
	}
	
	
	/*
	 * @RequestMapping("/wish") public ModelAndView getMessage() {
	 * 
	 * String result=service.generateWishMsg();
	 * 
	 * return new ModelAndView("display","wMsg",result);
	 * 
	 * 
	 * 
	 * }
	 */
	 
	

	/*
	 * @RequestMapping("/wish") public String getMessage(BindingAwareModelMap map) {
	 * 
	 * String result=service.generateWishMsg(); map.addAttribute("wMsg", result);
	 * 
	 * return "display";
	 * 
	 * 
	 * }
	 */
	
	
	  @RequestMapping("/wish/{name}")
	  
	  public String getMessage(Map<String,Object> map,@PathVariable("name") String name) {
	  
	  String result=service.generateWishMsg(name);
	  map.put("wMsg", result);
	  
	  return "display";
	  
	  }
	 
	
}
