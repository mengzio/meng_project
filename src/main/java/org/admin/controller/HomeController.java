package org.admin.controller;

import java.util.HashMap;
import java.util.List;

import org.admin.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private HomeService homeservice;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		int totalCount = 0;
		
		//
		totalCount = homeservice.getTotalCount();
		List<HashMap<String, Object>> testList = homeservice.getTestList();
		
		model.addAttribute("totalCount", totalCount );
		model.addAttribute("testList", testList );
		
		return "home";
	}
	
}
