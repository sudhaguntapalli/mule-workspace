/**
 * 
 */
package com.aparna.entities;

/**
 * @author appu "address": { "address1": "36000 fremont blvd", "address2":
 *         "street 57", "city": "fremont", "state": "california", "zipcode":
 *         "94536", "country": "united states of america" }
 */
public class Address implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7512829995964307842L;

	public Address() {
		super();
	}
	

	public Address(String address1, String address2, String city, String state, String zipcode, String country) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
	}

	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipcode;
	private String country;

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getState() {
		return state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
