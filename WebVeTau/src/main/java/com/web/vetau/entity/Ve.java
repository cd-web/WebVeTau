package com.web.vetau.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ve")
public class Ve {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int veId;
	
	@Column(name = "ten_khach_hang")
	private String tenKhachHnag;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "cmnd")
	private String cmnd;
	
	@Column(name = "chuyen_xe_id")
	private int chuyenXe;
	
	@Column(name = "so_ghe")
	private int soGhe;
}
