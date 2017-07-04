package com.taotao.portal.service;

import com.taotao.portal.pojo.ItemInfo;

/**
 * @author yanni
 * @time 2017年6月28日下午8:20:05
 */
public interface ItemService
{

	ItemInfo getItemById(Long itemId);

	String getItemDescById(Long itemId);

	String getItemParam(Long itemId);

}
