package cn.xdl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/toLogin")
	public String toLogin() {
		System.out.println("aaaaaaaaaaaa");
		return "login";
	}
}
