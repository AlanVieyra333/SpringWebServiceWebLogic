package com.telmex.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@GetMapping(value = "/")
	@ResponseBody Object index(Long id) {
		Ex example = new Ex();
		example.setOk("Hello world! id: " + id);
		
		return example;
	}

	class Ex {
		private String ok;

		public String getOk() {
			return ok;
		}

		public void setOk(String ok) {
			this.ok = ok;
		}
	}
}
