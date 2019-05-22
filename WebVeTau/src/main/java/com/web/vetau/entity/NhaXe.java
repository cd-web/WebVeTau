package com.web.vetau.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nha_xe")
public class NhaXe {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nhaXeId;
	
	@Column(name = "ten_nha_xe")
	private String tenNhaXe;
	
	@Column(name = "mo_ta")
	private String moTa;
	
	@Column(name = "nguoi_tao")
	private int nguoiTao;
	
	public NhaXe() {
		// TODO Auto-generated constructor stub
	}
	

	public NhaXe(String tenNhaXe, String moTa, int nguoiTao) {
		super();
		this.tenNhaXe = tenNhaXe;
		this.moTa = moTa;
		this.nguoiTao = nguoiTao;
	}


	public NhaXe(int nhaXeId, String tenNhaXe, String moTa, int nguoiTao) {
		super();
		this.nhaXeId = nhaXeId;
		this.tenNhaXe = tenNhaXe;
		this.moTa = moTa;
		this.nguoiTao = nguoiTao;
	}


	public int getNhaXeId() {
		return nhaXeId;
	}

	public void setNhaXeId(int nhaXeId) {
		this.nhaXeId = nhaXeId;
	}

	public String getTenNhaXe() {
		return tenNhaXe;
	}

	public void setTenNhaXe(String tenNhaXe) {
		this.tenNhaXe = tenNhaXe;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public int getNguoiTao() {
		return nguoiTao;
	}

	public void setNguoiTao(int nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	
	
}
