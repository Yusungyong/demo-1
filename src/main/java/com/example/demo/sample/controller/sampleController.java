package com.example.demo.sample.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.sample.service.SampleService;

@Controller
public class sampleController {
	
	@Autowired
	SampleService sampleService;
	
	@GetMapping("/")
	public String sampleEndPoint(Model model) {
		System.out.println("Controller ... ");
		String testCount = sampleService.selectTable();
		model.addAttribute("count", testCount);
		return "/index";
	}
}
