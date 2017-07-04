package com.taotao.order.dao;
/**
 * 
 * @author yanni
 * @time   2017年7月2日 下午11:13:29
 */
public interface JedisClient
{

	String get(String key);

	String set(String key ,String value);

	String hget(String hkey ,String key);

	long hset(String hkey ,String key ,String value);

	long incr(String key);

	long expire(String key ,int second);

	long ttl(String key);

	long del(String key);

	long hdel(String hkey ,String key);

}
