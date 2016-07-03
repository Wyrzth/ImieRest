package com.restImie.services;

import com.restImie.dao.DataDao;
import com.restImie.model.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DataServicesImpl implements DataServices {

	@Autowired
	DataDao dataDao;
	
	@Override
	public boolean addEntity(Order order) throws Exception {
		return dataDao.addEntity(order);
	}

	@Override
	public Order getEntityById(long id) throws Exception {
		return dataDao.getEntityById(id);
	}

	@Override
	public List<Order> getEntityList() throws Exception {
		return dataDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		return dataDao.deleteEntity(id);
	}

}
