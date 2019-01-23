package com.telmex.application;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@RequestMapping(value = "/",
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_XML_VALUE})
	public Object index() {
		Ex example = new Ex();
		example.setOk("Hello!");
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
