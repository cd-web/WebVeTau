package com.web.vetau.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chuyen_xe")
public class ChuyenXe {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int chuyenXeId;
	
	@Column(name = "nha_xe_id")
	private int nhaXe;
	
	@Column(name = "ga_di")
	private String gaDi;
	
	@Column(name = "ga_den")
	private String gaDen;
	
	@Column(name = "tong_so_ghe")
	private int tongSoGhe;
	
	@Column(name = "ghe_da_dat")
	private String gheDaDat;
	
	@Column(name = "gia_ve")
	private int giaVe;
	
	@Column(name = "ngay_di")
	private Date ngayDi;
	
	@Column(name = "ngay_den")
	private Date ngayDen;
	
	@Column(name = "mo_ta")
	private String moTa;
	
	@Column(name = "nguoi_tao")
	private int nguoiTao;
	public ChuyenXe() {
		
	}
	
	public ChuyenXe(int nhaXe, String gaDi, String gaDen, int tongSoGhe, String gheDaDat, int giaVe, Date ngayDi,
			Date ngayDen, String moTa, int nguoiTao) {
		super();
		this.nhaXe = nhaXe;
		this.gaDi = gaDi;
		this.gaDen = gaDen;
		this.tongSoGhe = tongSoGhe;
		this.gheDaDat = gheDaDat;
		this.giaVe = giaVe;
		this.ngayDi = ngayDi;
		this.ngayDen = ngayDen;
		this.moTa = moTa;
		this.nguoiTao = nguoiTao;
	}

	public ChuyenXe(int chuyenXeId, int nhaXe, String gaDi, String gaDen, int tongSoGhe, String gheDaDat, int giaVe,
			Date ngayDi, Date ngayDen, String moTa, int nguoiTao) {
		super();
		this.chuyenXeId = chuyenXeId;
		this.nhaXe = nhaXe;
		this.gaDi = gaDi;
		this.gaDen = gaDen;
		this.tongSoGhe = tongSoGhe;
		this.gheDaDat = gheDaDat;
		this.giaVe = giaVe;
		this.ngayDi = ngayDi;
		this.ngayDen = ngayDen;
		this.moTa = moTa;
		this.nguoiTao = nguoiTao;
	}

	public int getChuyenXeId() {
		return chuyenXeId;
	}
	public void setChuyenXeId(int chuyenXeId) {
		this.chuyenXeId = chuyenXeId;
	}
	public int getNhaXe() {
		return nhaXe;
	}
	public void setNhaXe(int nhaXe) {
		this.nhaXe = nhaXe;
	}
	public String getGaDi() {
		return gaDi;
	}
	public void setGaDi(String gaDi) {
		this.gaDi = gaDi;
	}
	public String getGaDen() {
		return gaDen;
	}
	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}
	public int getTongSoGhe() {
		return tongSoGhe;
	}
	public void setTongSoGhe(int tongSoGhe) {
		this.tongSoGhe = tongSoGhe;
	}
	public String getGheDaDat() {
		return gheDaDat;
	}
	public void setGheDaDat(String gheDaDat) {
		this.gheDaDat = gheDaDat;
	}
	public int getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(int giaVe) {
		this.giaVe = giaVe;
	}
	public Date getNgayDi() {
		return ngayDi;
	}
	public void setNgayDi(Date ngayDi) {
		this.ngayDi = ngayDi;
	}
	public Date getNgayDen() {
		return ngayDen;
	}
	public void setNgayDen(Date ngayDen) {
		this.ngayDen = ngayDen;
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
