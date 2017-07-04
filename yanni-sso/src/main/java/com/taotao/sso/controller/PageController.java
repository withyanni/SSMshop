package com.taotao.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转Controller
 * 
 * @author yanni
 * @time 2017年6月29日 下午8:28:23
 */
@Controller
@RequestMapping ("/page")
public class PageController
{

	@RequestMapping ("/register")
	public String showRegister()
	{
		return "register";
	}

	@RequestMapping ("/login")
	public String showLogin(String redirect ,Model model)
	{
		model.addAttribute("redirect",redirect);
		return "login";
	}
}
