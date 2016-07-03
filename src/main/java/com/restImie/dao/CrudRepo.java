package com.restImie.dao;

import com.restImie.model.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by joe on 24/06/2016.
 */
public interface CrudRepo extends CrudRepository<Order,Integer> {

    Order findOrder(Integer id);

}
