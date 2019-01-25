package com.telmex.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telmex.application.entity.Actor;
import com.telmex.application.service.DemoService;

@RestController
public class IndexController {
	@Autowired
	private DemoService demoService;

	@GetMapping(value = "/")
	public Object index(Long id) {
		Actor demo = demoService.getServicio(id);
		System.out.println(demo);
		return demo;
	}
}
