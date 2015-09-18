package com.app.newput.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserBean {

	private String name;
	private String address;
	private int mobile;
	private int maxId;
	private int id;
	private int count;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	private String table_name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaxId() {
		return maxId;
	}
	public void setMaxId(int maxId) {
		this.maxId = maxId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
}
