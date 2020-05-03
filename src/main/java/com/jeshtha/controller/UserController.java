package com.jeshtha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeshtha.security.CurrentUser;
import com.jeshtha.security.UserPrincipal;

@RestController
@RequestMapping("/api")
public class UserController {

	@GetMapping(value="/get")
	public String test(@CurrentUser UserPrincipal principal) {
		return "Hello.......!"+principal.getName();
	}
}
