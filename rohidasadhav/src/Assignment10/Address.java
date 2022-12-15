package Assignment10;
package com.hiberstudent;
import javax.persistence.Embeddable;
//using embeddable 
@Embeddable
public class Address
{
	//declare private data member
private String hname;
private String area;
private String city;
private int pincode;
//default constructor
public Address() {

	// TODO Auto-generated constructor stub
}
//constructor using fields
public Address(String hname, String area, String city, int pincode) {
	super();
	this.hname = hname;
	this.area = area;
	this.city = city;
	this.pincode = pincode;
}
public String getHname() {
	return hname;
}
public void setHname(String hname) {
	this.hname = hname;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
}

