package com.tut;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name = "ADDRESS") // use for change table name
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // use for putting auto increment
	@Column(length = 50, name = "ADDRESS_ID") // use for changing table column name
	private int addressid;
	@Column(length = 50, name = "STREET")
	private String street;
	@Column(length = 50, name = "CITY")
	private String city;
	@Column(name = "IS_OPEN")
	private boolean isopen;
	// @Transient // use for make one unique column

	@Temporal(TemporalType.DATE)
	private Date date;
	// @Lob // use for store learge obj.

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressid, String street, String city, boolean isopen, double x, Date date, byte[] image) {
		super();
		this.addressid = addressid;
		this.street = street;
		this.city = city;
		this.isopen = isopen;
		this.date = date;
	}

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isIsopen() {
		return isopen;
	}

	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
