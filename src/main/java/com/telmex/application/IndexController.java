package com.telmex.application;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@GetMapping(value = "/",
			produces = {MediaType.APPLICATION_XML_VALUE})
	public Object index() {
		Ex example = new Ex();
		example.setOk("Hello world!");
		return example;
	}
	
	private class Ex {
		private String ok;

		public String getOk() {
			return ok;
		}

		public void setOk(String ok) {
			this.ok = ok;
		}
		
	}
}
