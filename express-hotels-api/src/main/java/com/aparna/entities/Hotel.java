/**
 * 
 */
package com.aparna.entities;

/**
 * @author appu { "hotelId": 1, "roomId": 10, "name": "Hyatt", "address": {
 *         "address1": "36000 fremont blvd", "address2": "street 57", "city":
 *         "fremont", "state": "california", "zipcode": "94536", "country":
 *         "united states of america" }, "phoneNumber": "98659689070", "rating":
 *         3, "comments": [ "good hotel", "very humble", "friendly staff" ],
 *         "price_details": { "capacity": 4, "bedSize": "king", "bedsAvailable":
 *         3, "price": 186.99 }, "services": { "cleaningFee": 50, "parkingFee":
 *         30, "breakfastIncluded": true, "wifiAccess": true, "cautionDeposit":
 *         100 } }
 */
public class Hotel  implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8371106351691476306L;

	public Hotel() {
		super();
	}

	private int hotelId;
	private int roomId;
	private String name;
	private Address address;
	private String phoneNumber;
	private int rating;
	private String[] comments;
	private PriceDetails price_details;
	private Services services;

	public Hotel(int hotelId, int roomId, String name, Address address, String phoneNumber, int rating,
			String[] comments, PriceDetails price_details, Services services) {
		super();
		this.hotelId = hotelId;
		this.roomId = roomId;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.rating = rating;
		this.comments = comments;
		this.price_details = price_details;
		this.services = services;
	}

	public Address getAddress() {
		return address;
	}

	public String[] getComments() {
		return comments;
	}

	public int getHotelId() {
		return hotelId;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public PriceDetails getPrice_details() {
		return price_details;
	}

	public int getRating() {
		return rating;
	}

	public int getRoomId() {
		return roomId;
	}

	public Services getServices() {
		return services;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setComments(String[] comments) {
		this.comments = comments;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPrice_details(PriceDetails price_details) {
		this.price_details = price_details;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public void setServices(Services services) {
		this.services = services;
	}
	
	
}
