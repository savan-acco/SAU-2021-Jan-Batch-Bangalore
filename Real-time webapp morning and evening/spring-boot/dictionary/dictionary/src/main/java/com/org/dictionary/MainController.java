package com.org.dictionary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping(value = "/test2")
	public String test() {
		return "Success";
	}
}
