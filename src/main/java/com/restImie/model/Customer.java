package com.restImie.model;

// Generated 23 juin 2016 13:44:24 by Hibernate Tools 4.0.0

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "rt_customer", catalog = "Rest")
public class Customer implements java.io.Serializable {

	private Integer id;
	private String ref;

	public Customer() {
	}

	public Customer(String ref) {
		this.ref = ref;
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

}