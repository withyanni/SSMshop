package com.taotao.search.dao;

import org.apache.solr.client.solrj.SolrQuery;

import com.taotao.search.pojo.SearchResult;

/**
 * @author yanni
 * @time 2017年6月27日下午6:57:37
 */
public interface SearchDao
{

	SearchResult search(SolrQuery query) throws Exception;
}
