package com.example.demo.model;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "noidungtrang")
public class noiDung implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private int id;
	

	
	@Column(name = "noidung")
	private String noidung;
	
	



	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public noiDung() {
		super();
	}

	public noiDung(int id, String noidung) {
		super();
		this.id = id;
		
		this.noidung = noidung;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
}
