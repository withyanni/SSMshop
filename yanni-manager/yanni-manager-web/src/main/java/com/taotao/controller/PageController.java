package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yanni
 * @time   2017年6月15日 下午8:49:52
 */

@Controller
public class PageController
{
	@RequestMapping("/")
	public String showIndex(){
		
		return "/index";
	}
	
	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page){
		return page;
	}
}
