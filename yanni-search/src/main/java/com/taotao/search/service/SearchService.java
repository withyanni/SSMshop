package com.taotao.search.service;

import com.taotao.search.pojo.SearchResult;
/**
 * 
 * @author yanni
 * @time   2017年6月27日下午6:55:12
 */
public interface SearchService
{

	SearchResult search(String queryString ,int page ,int rows)
			throws Exception;
}
