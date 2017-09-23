/**
 * 
 */
package com.aparna.entities;

/**
 * @author appu
 * 
 *
 *         "price_details": { "capacity": 4, "bedSize": "king", "bedsAvailable":
 *         3, "price": 186.99 }
 */
public class PriceDetails implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3795825104902563485L;

	public PriceDetails() {
		super();
	}

	public PriceDetails(int capacity, String bedSize, int bedsAvailable, double price) {
		super();
		this.capacity = capacity;
		this.bedSize = bedSize;
		this.bedsAvailable = bedsAvailable;
		this.price = price;
	}

	private int capacity;
	private String bedSize;
	private int bedsAvailable;
	private double price;

	public int getBedsAvailable() {
		return bedsAvailable;
	}

	public String getBedSize() {
		return bedSize;
	}

	public int getCapacity() {
		return capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setBedsAvailable(int bedsAvailable) {
		this.bedsAvailable = bedsAvailable;
	}

	public void setBedSize(String bedSize) {
		this.bedSize = bedSize;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
