package com.restImie.services;

import com.restImie.model.Order;

import java.util.List;

public interface DataServices {
	public boolean addEntity(Order order) throws Exception;
	public Order getEntityById(long id) throws Exception;
	public List<Order> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
}
