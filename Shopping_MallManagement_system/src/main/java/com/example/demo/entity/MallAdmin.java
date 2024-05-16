package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MallAdmin {
	
	@Id
	private int id;
	private String name;
	private String types;
	private String password;
	private String mall;
	private String phone;
	public MallAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MallAdmin(int id, String name, String types, String password, String mall, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.types = types;
		this.password = password;
		this.mall = mall;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMall() {
		return mall;
	}
	public void setMall(String mall) {
		this.mall = mall;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "MallAdmin [id=" + id + ", name=" + name + ", types=" + types + ", password=" + password + ", mall="
				+ mall + ", phone=" + phone + "]";
	}
	
	

}
