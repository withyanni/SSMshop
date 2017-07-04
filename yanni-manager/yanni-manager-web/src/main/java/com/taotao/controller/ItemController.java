package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

/**
 * @author yanni
 * @time 2017年6月15日 下午7:55:28
 */
@Controller
public class ItemController
{
	@Autowired
	private ItemService itemService;

	@RequestMapping ("/Item/{ItemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable long ItemId)
	{
		TbItem tbItem=itemService.getItemById(ItemId);

		return tbItem;
	}

	@RequestMapping ("/item/list")
	@ResponseBody
	public EUDataGridResult getItemList(Integer page ,Integer rows)
	{
		EUDataGridResult result=itemService.getItemList(page,rows);
		return result;
	}

	@RequestMapping (value="/item/save",method=RequestMethod.POST)
	@ResponseBody
	private TaotaoResult createItem(TbItem item ,String desc ,String itemParams)
			throws Exception
	{
		TaotaoResult result=itemService.createItem(item,desc,itemParams);
		return result;
	}

}
