package com.restImie.dao;

import com.restImie.model.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DataDaoImpl implements DataDao {

 @Autowired
 SessionFactory sessionFactory;

 Session session = null;
 Transaction tx = null;

 @Override
 public boolean addEntity(Order order) throws Exception {

  session = sessionFactory.openSession();
  tx = session.beginTransaction();
  session.save(order);
  tx.commit();
  session.close();

  return false;
 }

 @Override
 public Order getEntityById(long id) throws Exception {
  session = sessionFactory.openSession();
  Order order = (Order) session.load(Order.class,
    new Long(id));
  tx = session.getTransaction();
  session.beginTransaction();
  tx.commit();
  return order;
 }

 @SuppressWarnings("unchecked")
 @Override
 public List getEntityList() throws Exception {
  session = sessionFactory.openSession();
  tx = session.beginTransaction();
  List customerList = session.createCriteria(Order.class)
    .list();
  tx.commit();
  session.close();
  return customerList;
 }
 
 @Override
 public boolean deleteEntity(long id)
   throws Exception {
  session = sessionFactory.openSession();
  Object o = session.load(Order.class, id);
  tx = session.getTransaction();
  session.beginTransaction();
  session.delete(o);
  tx.commit();
  return false;
 }

}