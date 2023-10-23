package com.example.entity;

public class Address {
	private int addrId;
	private String dNo;
	private String streetName;
	private String city;
	private String state;
	private int pinCode;
	public int getAddrId() {
		return addrId;
	}
	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	public String getdNo() {
		return dNo;
	}
	public void setdNo(String dNo) {
		this.dNo = dNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
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
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", dNo=" + dNo + ", streetName=" + streetName + ", city=" + city
				+ ", state=" + state + ", pinCode=" + pinCode + "]";
	}
}
