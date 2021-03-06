package com.restImie.model;

// Generated 23 juin 2016 13:44:24 by Hibernate Tools 4.0.0

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name = "rt_order", catalog = "Rest")
public class Order implements java.io.Serializable {

	private Integer id;
	private String ref;
	private int customerId;

	public Order() {
	}

	public Order(int customerId) {
		this.customerId = customerId;
	}

	public Order(String ref, int customerId) {
		this.ref = ref;
		this.customerId = customerId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "ref", length = 45)
	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	@Column(name = "Customer_id", nullable = false)
	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

}
