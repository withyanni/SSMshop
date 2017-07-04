package com.taotao.portal.service;

import com.taotao.portal.pojo.SearchResult;
/**
 * 
 * @author yanni
 * @time   2017年6月28日下午8:11:44
 */
public interface SearchService
{

	SearchResult search(String queryString ,int page);
}
