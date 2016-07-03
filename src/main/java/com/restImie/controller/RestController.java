package com.restImie.controller;

import com.restImie.model.Order;
import com.restImie.services.DataServices;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class RestController {

	@Autowired
	DataServices dataServices;

	static final Logger logger = Logger.getLogger(RestController.class);

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	String addOrder(@RequestBody Order order) {
		try {
			dataServices.addEntity(order);
			return "Order added Successfully !";
		} catch (Exception e) {
			// e.printStackTrace();
			return  e.toString();
		}

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Order getOrder(@PathVariable("id") long id) {
		Order employee = null;
		try {
			employee = dataServices.getEntityById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<Order> getOrders() {

		List<Order> employeeList = null;
		try {
			employeeList = dataServices.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeList;
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody
	String deleteOrder(@PathVariable("id") long id) {

		try {
			dataServices.deleteEntity(id);
			return "Order deleted Successfully !";
		} catch (Exception e) {
			return  e.toString();
		}

	}
}
