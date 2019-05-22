package com.web.vetau.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "gender")
	private boolean gender;
	
	@Column(name = "brithday")
	private Date birthday;
	
	@Column(name = "cmnd")
	private String cmnd;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "nha_xe")
	private String nhaXe;
	
	@Column(name = "role_id")
	private String roleId;
	
	public Account() {
		
	}
	
	public Account(String name, boolean gender, Date birthday, String cmnd, String phone, String address, String email,
			String nhaXe, String roleId) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.cmnd = cmnd;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.nhaXe = nhaXe;
		this.roleId = roleId;
	}

	public Account(int accountId, String name, boolean gender, Date birthday, String cmnd, String phone, String address,
			String email, String nhaXe, String roleId) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.cmnd = cmnd;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.nhaXe = nhaXe;
		this.roleId = roleId;
	}


	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNhaXe() {
		return nhaXe;
	}

	public void setNhaXe(String nhaXe) {
		this.nhaXe = nhaXe;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	
}
