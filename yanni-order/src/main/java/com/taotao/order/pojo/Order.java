package com.taotao.order.pojo;

import java.util.List;

import com.taotao.pojo.TbOrder;
import com.taotao.pojo.TbOrderItem;
import com.taotao.pojo.TbOrderShipping;
/**
 * 
 * @author yanni
 * @time   2017年7月2日 下午11:13:57
 */
public class Order extends TbOrder
{

	private List<TbOrderItem> orderItems;
	private TbOrderShipping orderShipping;

	public List<TbOrderItem> getOrderItems()
	{
		return orderItems;
	}

	public void setOrderItems(List<TbOrderItem> orderItems)
	{
		this.orderItems=orderItems;
	}

	public TbOrderShipping getOrderShipping()
	{
		return orderShipping;
	}

	public void setOrderShipping(TbOrderShipping orderShipping)
	{
		this.orderShipping=orderShipping;
	}

}
