/**
 * 
 */
package com.aparna.entities;

/**
 * @author appu
 *
 *         "services": { "cleaningFee": 50, "parkingFee": 30,
 *         "breakfastIncluded": true, "wifiAccess": true, "cautionDeposit": 100
 *         }
 */
public class Services implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1332348460149855911L;

	public Services() {
		super();
	}

	public Services(double cleaningFee, double parkingFee, boolean breakfastIncluded, boolean wifiAccess,
			double cautionDeposit) {
		super();
		this.cleaningFee = cleaningFee;
		this.parkingFee = parkingFee;
		this.breakfastIncluded = breakfastIncluded;
		this.wifiAccess = wifiAccess;
		this.cautionDeposit = cautionDeposit;
	}

	private double cleaningFee;
	private double parkingFee;
	private boolean breakfastIncluded;
	private boolean wifiAccess;
	private double cautionDeposit;

	public double getCautionDeposit() {
		return cautionDeposit;
	}

	public double getCleaningFee() {
		return cleaningFee;
	}

	public double getParkingFee() {
		return parkingFee;
	}

	public boolean isBreakfastIncluded() {
		return breakfastIncluded;
	}

	public boolean isWifiAccess() {
		return wifiAccess;
	}

	public void setBreakfastIncluded(boolean breakfastIncluded) {
		this.breakfastIncluded = breakfastIncluded;
	}

	public void setCautionDeposit(double cautionDeposit) {
		this.cautionDeposit = cautionDeposit;
	}

	public void setCleaningFee(double cleaningFee) {
		this.cleaningFee = cleaningFee;
	}

	public void setParkingFee(double parkingFee) {
		this.parkingFee = parkingFee;
	}

	public void setWifiAccess(boolean wifiAccess) {
		this.wifiAccess = wifiAccess;
	}

}
