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
	
	@Column(name = "ten")
	private String ten;
	
	@Column(name = "gioi_tinh")
	private boolean gioiTinh;
	
	@Column(name = "ngay_sinh")
	private Date ngaySinh;
	
	@Column(name = "cmnd")
	private String cmnd;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "dia_chi")
	private String diaChi;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "nha_xe_id")
	private int nhaXeId;
	
	@Column(name = "role_id")
	private String roleId;
	
	@Column(name = "ten_dang_nhap")
	private String tenDangNhap;
	
	@Column(name = "mat_khau")
	private String matKhau;
	
	public Account() {
		
	}
	
	

	public Account(String ten, boolean gioiTinh, Date ngaySinh, String cmnd, String phone, String diaChi, String email,
			int nhaXeId, String roleId, String tenDangNhap, String matKhau) {
		super();
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.cmnd = cmnd;
		this.phone = phone;
		this.diaChi = diaChi;
		this.email = email;
		this.nhaXeId = nhaXeId;
		this.roleId = roleId;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
	}
	



	public Account(int accountId, String ten, boolean gioiTinh, Date ngaySinh, String cmnd, String phone, String diaChi,
			String email, int nhaXeId, String roleId, String tenDangNhap, String matKhau) {
		super();
		this.accountId = accountId;
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.cmnd = cmnd;
		this.phone = phone;
		this.diaChi = diaChi;
		this.email = email;
		this.nhaXeId = nhaXeId;
		this.roleId = roleId;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
	}



	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
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

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNhaXeId() {
		return nhaXeId;
	}

	public void setNhaXeId(int nhaXeId) {
		this.nhaXeId = nhaXeId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	
	
	
}
