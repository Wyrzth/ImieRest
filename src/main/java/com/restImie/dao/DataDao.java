package com.restImie.dao;

import com.restImie.model.Order;

import java.util.List;

public interface DataDao {

 public boolean addEntity(Order order) throws Exception;
 public Order getEntityById(long id) throws Exception;
 public List<Order> getEntityList() throws Exception;
 public boolean deleteEntity(long id) throws Exception;
}