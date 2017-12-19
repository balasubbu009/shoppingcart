package com.denken.shoppingcart.dao;

import java.util.List;

import com.denken.shoppingcart.model.CartInfo;
import com.denken.shoppingcart.model.OrderDetailInfo;
import com.denken.shoppingcart.model.OrderInfo;
import com.denken.shoppingcart.model.PaginationResult;

public interface OrderDAO {
	 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}