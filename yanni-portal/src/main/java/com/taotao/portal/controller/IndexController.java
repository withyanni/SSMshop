package com.taotao.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taotao.portal.service.ContentService;

/**
 * @author yanni
 * @time 2017年6月23日 下午11:26:40
 */
@Controller
public class IndexController
{
	@Autowired
	private ContentService contentService;

	@RequestMapping ("/index")
	public String showIndex(Model model)
	{
		String adJson=contentService.getContentList();
		model.addAttribute("ad1",adJson);

		return "index";
	}
}
