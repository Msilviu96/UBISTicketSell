package com.ubis.controller;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String setSession(HttpSession session) {
		if (session.getAttribute("user") == null) {
			User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			session.setAttribute("user", user.getUsername());
		}
		return "home";
	}
}
