package com.example.demo.model;




import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tintuc")
public class TinTuc implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "tieude")
	private String tieude;
	
	@Column(name = "noidung")
	private String noidung;
	
	@Column(name = "ngay")
	private String ngay;
	
	public String getNgay() {
		return ngay;
	}

	public void setNgay(String ngay) {
		this.ngay = ngay;
	}

	public String getTieude() {
		return tieude;
	}

	public void setTieude(String tieude) {
		this.tieude = tieude;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public TinTuc() {
		super();
	}

	public TinTuc(int id, String tieude, String noidung, String ngay) {
		super();
		this.id = id;
		this.tieude = tieude;
		this.noidung = noidung;
		this.ngay=ngay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
}