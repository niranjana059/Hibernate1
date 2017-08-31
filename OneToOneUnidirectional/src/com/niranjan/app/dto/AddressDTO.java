package com.niranjan.app.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="address")
public class AddressDTO implements Serializable {
	
	@Id
	@Column(name="id")
	@GenericGenerator(name="custom",strategy="increment")
	@GeneratedValue(generator="custom")
	private int id;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pincode")
	private long pincode;
	
	public AddressDTO() {
		System.out.println(this.getClass().getSimpleName()+" created..");
	}
	@Override
	public String toString() {
		return "AddressDTO [id=" + id + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
}
