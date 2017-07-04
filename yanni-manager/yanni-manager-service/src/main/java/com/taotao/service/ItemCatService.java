package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EUTreeNode;
/**
 * 
 * @author yanni
 * @time   2017年6月18日上午1:13:21
 */
public interface ItemCatService {

	List<EUTreeNode> getCatList(long parentId);
}
