package com.hzy92.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hzy92.web.orm.Test;
import com.hzy92.web.service.ITestService;

@Controller
public class WelcomeController {
	@Autowired
	private ITestService testService;
	@RequestMapping("index.do")
	public ModelAndView index(ModelMap mm){
		Test test = testService.getTestByName("hzy92");
		mm.put("test", test);
		return new ModelAndView("index");
	}
}
