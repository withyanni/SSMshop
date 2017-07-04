package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;

/**
 * @author yanni
 * @time 2017年6月15日 下午7:56:15
 */
public interface ItemService
{
	TbItem getItemById(long ItemId);

	EUDataGridResult getItemList(int page ,int rows);

	TaotaoResult createItem(TbItem item ,String desc ,String itemParam)
			throws Exception;
}
