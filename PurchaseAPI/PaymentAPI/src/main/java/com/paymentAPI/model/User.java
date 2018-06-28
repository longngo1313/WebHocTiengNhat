package com.paymentAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user_api")
public class User {
	
	@Id
	@Column(name = "user_id")
	private Long id;
	@Column(name = "user_name")
	private String name;
	@Column(name = "user_level", nullable = true)
	private Integer level = 0;
	@Column(name = "user_phone")
	private String phone;
	@Column(name = "strDate")
	private String strDate;
	@Column(name = "endDate")
	private String endDate;
	@Column(name = "user_type")
	private String type;

	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	
	public User(String phone, String strDate, String endDate, Long id, String type, String name) {
		super();
		this.phone = phone;
		this.strDate = strDate;
		this.endDate = endDate;
		this.id = id;
		this.type = type;
		this.name = name;
	}
	
	public User() {
		
	}
	
}
